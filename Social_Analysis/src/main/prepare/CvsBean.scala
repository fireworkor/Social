package bean

import org.apache.commons.math3.stat.descriptive.summary.Product

/**
  * 作者  :      fireworkor  3159553637@qq.com
  * 日期  :        2018/06/11  20:33  星期一
  * 描述  :   
  *
  */

class CvsBean(
               val weibocontent: String,
               val weibowriter: String,
               val weibopublishtime: String,
               val forword: String,
               val comment: String,
               val like: String,
               val website: String,
               val newtime: String,
               val weibolink: String,
               val weibowriterlink: String
             ) extends Product with Serializable {

  // 元素个属性的映射关系 log = new Log     log.productElement(0)
  //    用户标识，任务id，时间，经纬度，速度
  //    "mac","taskid","time","lat","lon","speed"
  def productElement(n: Int): Any = n match {
    case 0 => weibocontent
    case 1 => weibowriter
    case 2 => weibopublishtime
    case 3 => forword
    case 4 => comment
    case 5 => like
    case 6 => website
    case 7 => newtime
    case 8 => weibolink
    case 9 => weibowriterlink
  }

  // 类的属性有多少个
  def productArity: Int

  = 10

  // 看对象是否已同一类型的对象
  def canEqual(that: Any): Boolean = that.isInstanceOf[CvsBean]
}

object CvsBean {

  def apply(arr: Array[String]): CvsBean = new CvsBean(
    arr(0),
    arr(1),
    arr(2),
    arr(3),
    arr(4),
    arr(5),
    arr(6),
    arr(7),
    arr(8),
    arr(9))
}


