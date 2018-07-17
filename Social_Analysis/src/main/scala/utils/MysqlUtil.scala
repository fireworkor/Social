package utils

import java.io.FileReader
import java.util.Properties

import org.apache.spark.sql.{Dataset, Row, SaveMode}

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/01/29  10:26  星期一
  * 描述  :   
  *
  */
object MysqlUtil {
    def getMysqlProperties(): Properties ={
      val p = new Properties()
  p.load(new FileReader("src\\main\\resources\\mysql.properties"))
  p
}

def getMysqlUrl():String={
  val url = "jdbc:mysql://localhost:3306/Social_Analysis?characterEncoding=utf-8"
  url
}
  def insert2Mysql(dataset: Dataset[Row],tableName:String): Unit ={

  dataset.write.mode(SaveMode.Overwrite).jdbc(getMysqlUrl(), tableName, getMysqlProperties())
}

}
