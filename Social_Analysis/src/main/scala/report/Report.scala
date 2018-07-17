package report

import org.apache.spark.sql.SparkSession
import utils.{DataFrameShow, MySparkUtil}

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/12  14:32  星期六
  * 描述  :   
  *
  */
trait Report extends DataFrameShow {
  def main(args: Array[String]): Unit = {
    MySparkUtil.checkArgs()
    val session = MySparkUtil.prepareSpark()
    report(session)
  }
  def report(session:SparkSession)

}
