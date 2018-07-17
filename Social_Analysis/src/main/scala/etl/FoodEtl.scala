package etl

import org.apache.spark.sql.{SaveMode, SparkSession}


/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/04  18:54  星期五
  * 描述  :   
  *
  */
object FoodEtl extends Etl {


  def cvs2Parquet(session: SparkSession): Unit = {
    val dataInputPath = "data/input/foodUser.csv"
    val dataOutputPath = "data/output/food/"
    val data = session.read.format("csv").option("header", "true").csv(dataInputPath)//.show()
    dataFrameShow(data)
    data.write.mode(SaveMode.Overwrite) parquet dataOutputPath

  }

}
