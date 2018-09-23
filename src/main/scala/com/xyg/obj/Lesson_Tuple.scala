package com.xyg.obj

/**
  * 与列表一样，与列表不同的是元组可以包含不同类型的元素。元组的值是通过将单个的值包含在圆括号中构成的。
  * 取值用”._XX” 可以获取元组中的值,注意：tuple最多支持22个参数
  */
object Lesson_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple = new Tuple1(1)
    val tuple2 = new Tuple2(1,2)
    val tuple3 = Tuple3(1,2,100)
    val tuple7 = (1,2,3,4,5,6,7)
    val tuple22 = Tuple22(1,2,3,4,5,6,7,8,9,10,'a',12,13,14,15,16,17,18,19,20,21,"abc")

    //注意：swap元素翻转，只针对二元组
//    println(tuple2.swap)
//    println(tuple22._22)
//    val iter = tuple7.productIterator
//    while(iter.hasNext){
//      println(iter.next())
//    }
//    
//    println(tuple22.toString())
  }
}