package com.xyg.obj

/**
 * 1.match 不仅可以匹配值还可以匹配类型
 * 2.match匹配时从上往下依次匹配，匹配上就不在往下匹配
 * 3.匹配的过程中会有数值的类型转换
 * 4.模式匹配是个整体，方法的“{...}”可以省略
 * 5.模式匹配中，都匹配不上时，会匹配到 case _ ，相当于default
 */
object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tuple = (1,"abc",1.1,'x',1f)
    val iter = tuple.productIterator
    while(iter.hasNext){
      MatchTest(iter.next())
    }
  }
  
  def MatchTest(elem:Any) =
    elem match{
      case 1 =>println("value is 1")
      case i:Int=>println("type is Int --"+i)
      case s:String =>println("type is String --"+s)
      case c:Char => println("type is Char --"+c)
      case d:Double => println("type is Double  --"+d)
      case _=>println(" no match ... ") 
    }
  
}