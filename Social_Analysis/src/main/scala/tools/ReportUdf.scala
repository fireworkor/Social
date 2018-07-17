package tools

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/05/12  17:39  星期六
  * 描述  :   
  *
  */
object ReportUdf {
  def handFans(s:String)  ={
    val str = s.replace("万","0000")
    str
  }
  def handArea(s:String)  ={
    val str = s.split("，")(0)
    str
  }

}
