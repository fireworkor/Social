package report

import org.apache.spark.sql.SparkSession
import tools.ReportUdf
import utils.MysqlUtil


/**
  * 作者  :   fireworkor  3159553637@qq.com
  * 时间  :   2018/5/4/0004  17:26
  * 描述  :
  * 美食：男女吃货比例，爱美食的用户的地域分布，受教育程度
  * 博主的关注人数topn，发微博最多的博主topn，粉丝数量最高的用户topn
  */
object FoodReport extends Report {

  override def report(session: SparkSession): Unit = {
    val dataInputPath = "data/output/food/"
    val data = session.read.parquet(dataInputPath)
    data.createTempView("data")
    //TODO 男女吃货比例
    sexReport(session, "sex")

    //TODO 受教育程度数量
    educationReport(session, "education")


    //TODO 吃货地域分布
    areaReport(session, "area")

    //TODO 博主的关注人数topn
    followsReport(session, "follows")
    //TODO 发微博最多的博主topn
    //weiboReport(session,"weibo")
    //TODO 粉丝数量最高的用户topn
    fansReport(session, "fans")


  }

  /**
    * 发微博最多的博主topn
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    */
  def weiboReport(session: SparkSession, tableName: String) = {
    val res = session.sql("select username," + tableName + " from data order by " + tableName.+("+0 desc")).limit(10)
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

  /**
    * 博主的关注人数topn
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    * @param num       限制插入的条数
    */
    def followsReport(session: SparkSession, tableName: String, num: Int = 10) {
    session.conf.set("spark.sql.shuffle.partitions", "1")
    val res = session.sql("select username,follows from data order by follows+0 desc").limit(10)
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

  /**
    * 粉丝统计
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    * @param num       限制插入的条数
    */
  def fansReport(session: SparkSession, tableName: String, num: Int = 10) = {
    session.udf.register("replace", ReportUdf.handFans _)

    val res = session.sql("select username," + tableName + " from data order by replace(fans)+0 desc").coalesce(1).limit(num)
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

  /**
    * 吃货地域统计
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    * @param num       限制插入的条数
    */
  def areaReport(session: SparkSession, tableName: String, num: Int = 10) = {
    session.udf.register("cutprovince", ReportUdf.handArea _)
    val res = session.sql("select cutprovince(" + tableName + ") province," + "count(*) num from data group by province").where("province  not like '其他' and province not like '海外'")
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

  /**
    * 男女比例统计
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    */
  def sexReport(session: SparkSession, tableName: String) = {
    val res = session.sql("select " + tableName + "," + "count(*) num from data group by " + tableName + " order by num ")
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

  /**
    * 受教育程度统计
    *
    * @param session   传入SparkSession
    * @param tableName 生成的表名
    */
  def educationReport(session: SparkSession, tableName: String) = {
    val res = session.sql("select " + tableName + "," + "count(*) num from data group by " + tableName + " order by num ").where("education is not null")
    MysqlUtil.insert2Mysql(res, "food_" + tableName + "_count")
  }

}