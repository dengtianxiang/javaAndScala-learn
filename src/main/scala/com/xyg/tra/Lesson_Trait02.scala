package com.xyg.tra

trait IsEqu{
  def isEqule(p1:Any):Boolean
  def isNotEqule(p2:Any) = !isEqule(p2)
}

class Point(xx:Int, xy:Int)extends IsEqu {
  val x = xx
  val y = xy
  def isEqule(p1: Any): Boolean = {
    p1.isInstanceOf[Point]&&p1.asInstanceOf[Point].x==this.x
  }
}
object Lesson_Trait02 {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(1,2)
    val p2 = new Point(1,3)
    println(p1.isEqule(p2))
    println(p1.isNotEqule(p2))
    
  }
}