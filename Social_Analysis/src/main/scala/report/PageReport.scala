package report

import org.apache.spark.sql.SparkSession
import utils.MysqlUtil


/**
 *  作者  :   fireworkor  3159553637@qq.com
 *  时间  :   2018/5/4/0004  14:07
 *  描述  :
 *  微博：weibowriter 的转发数，评论数，点赞数topn
 */
object PageReport extends Report {

  def report(session:SparkSession): Unit ={
    val dataInputPath = "data/output/page"
    val data = session.read.parquet(dataInputPath)
    data.createTempView("data")
//TODO 微博：weibowriter 的转发数，评论数，点赞数topn
//    IndexReport(session,"forword",10,"DESC")
//    IndexReport(session,"comment",10,"DESC")
//    IndexReport(session,"like",10,"DESC")
        contentReport(session,"forword",10,"DESC")
        contentReport(session,"comment",10,"DESC")
        contentReport(session,"like",10,"DESC")

  }



  /**
    * 拼写sql，计算weibowriter 的转发数，评论数，点赞数topn
    * @param session 传入SparkSession
    * @param tableName  插入数据库的表名
    * @param num  限制插入的条数，默认10条
    * @param order 需要排列的顺序取 desc 和 asc 否则抛异常
    */
  def IndexReport(session: SparkSession, tableName:String, num:Int=10, order:String="DESC")={
    if(!(order.toUpperCase.equals("DESC")||order.toUpperCase.equals("ASC"))){
      throw new Exception
    }
    //val  sql = "select weibowriter,"+tableName+"+0 "+tableName+"_num"+" from data order by "+tableName+"_num "+ order + "  limit "+num
    val  sql = "select weibowriter,"+tableName+" "+tableName+"_num"+" from data order by "+tableName+"_num+0 "+ order + "  limit "+num
    val res = session.sql(sql)
    MysqlUtil.insert2Mysql(res, "page_" + tableName + "_" + order)
  }

  /**
    * 拼写sql，计算weibowriter 的转发数，评论数，点赞数topn
    * @param session 传入SparkSession
    * @param tableName  插入数据库的表名
    * @param num  限制插入的条数，默认10条
    * @param order 需要排列的顺序取 desc 和 asc 否则抛异常
    */
  def contentReport(session: SparkSession, tableName:String, num:Int=10, order:String="DESC")={
    if(!(order.toUpperCase.equals("DESC")||order.toUpperCase.equals("ASC"))){
      throw new Exception
    }
    //val  sql = "select weibowriter,"+tableName+"+0 "+tableName+"_num"+" from data order by "+tableName+"_num "+ order + "  limit "+num
    val  sql = "select weibowriter,weibocontent,"+tableName+" "+tableName+"_num"+" from data order by "+tableName+"_num+0 "+ order + "  limit "+num
    val res = session.sql(sql)
    dataFrameShow(res)
   MysqlUtil.insert2Mysql(res, "page_" + tableName)
  }

}