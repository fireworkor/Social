package etl

import org.apache.spark.sql.SparkSession
import utils.{DataFrameShow, MySparkUtil}

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/12  14:21  星期六
  * 描述  :   
  *
  */
trait Etl extends DataFrameShow{
  def main(args: Array[String]): Unit = {
    MySparkUtil.checkArgs()
    val session = MySparkUtil.prepareSpark()
    cvs2Parquet(session)
  }
  def cvs2Parquet(session:SparkSession )

}
