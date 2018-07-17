package utils

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/12  13:42  星期六
  * 描述  :   
  *
  */
object MySparkUtil {
    val conf = new SparkConf()
      .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    val session = SparkSession.builder()
      .config(conf)
      .appName(this.getClass.getName)
      .master("local[*]")
      .getOrCreate()
    val sQLContext = session.sqlContext
    sQLContext.setConf("spark.sql.parquet.compression.codec", "snappy")

  def prepareSpark()={

    session
  }

  def checkArgs() ={
    //  if(args.length!=2) {
    //    println(
    //      """
    //        | Cvs2Parquet
    //        |参数:
    //        |dataInputPath  日志输入路径
    //        |outPutPath 结果输出路径
    //      """.stripMargin)
    //    sys.exit()
    //  }
    //    val Array(dataInputPath,outputPath)=args
  }

}
