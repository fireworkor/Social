package utils

import org.apache.spark.sql.DataFrame

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/12  14:41  星期六
  * 描述  :   
  *
  */
trait DataFrameShow {
  def dataFrameShow(data:DataFrame,flag:Boolean=false): Unit ={
    if(flag==true){
    data.show()
    }
  }

}
