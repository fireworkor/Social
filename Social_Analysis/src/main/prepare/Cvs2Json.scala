import bean.CvsBean
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/06/11  20:23  星期一
  * 描述  :   
  *
  */
object Cvs2Json {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .registerKryoClasses(Array(classOf[CvsBean]))
    val session = SparkSession.builder()
      .config(conf)
      .appName(this.getClass.getName)
      .master("local[*]")
      .getOrCreate()
    val sQLContext = session.sqlContext
    sQLContext.setConf("spark.sql.parquet.compression.codec", "snappy")
    val dataInputPath = "data/input/page.csv"
    val data =session.read.format("csv").option("header", "true").csv(dataInputPath)
    data.write.mode("overwrite").json("jsondata/page.log")

    session.close()
  }

}
