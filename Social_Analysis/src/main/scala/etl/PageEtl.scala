package etl

import org.apache.spark.sql.{SaveMode, SparkSession}

/**
  * 作者  :   fireworkor  3159553637@qq.com
  * 时间  :   2018/5/4/0004  11:42
  * 描述  :   将cvs格式的字段处理成parquet文件形式
  *
  */
object PageEtl extends Etl {

  def cvs2Parquet(session: SparkSession): Unit = {
    val dataInputPath = "data/input/page.csv"
    val dataOutputPath = "data/output/page/"
    val data = session.read.format("csv").option("header", "true").csv(dataInputPath) //.show()
    data.write.mode(SaveMode.Overwrite) parquet dataOutputPath
  }

}
