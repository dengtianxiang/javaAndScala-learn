package com.xyg.obj

object Lesson_Array {
  def main(args: Array[String]): Unit = {
    /**
     * 定义array两种方式  Array | new Array
     */
//    val arr1 = Array[Int](1,2,3,4)
//    arr1.foreach(println)
//    for(elem<-arr1){
//      println(elem)
//    }
    
//    val arr = new Array(3)
//    arr(0) = 1
//    arr(1) = 100
//    arr(2) = 1000
//    arr.foreach(x=>{println(x)})
//    for(elem <- arr){
//      println(elem)
//    }
    
    /**
     * 二维数组
     */
//    val array = Array[Array[String]](Array("a","b"),Array("c","d"))
//    array.foreach(arr=>{arr.foreach { println}})
//    for(arr<-array;elem<-arr){
//      println(elem)
//    }
//    val array = new Array[Array[Int]](3)
//    array(0)= Array(1,2)
//    array(1)= Array(1,2)
//    array(2)= Array(1,2)
    
    /**
     * 方法
     */
//   val arr =  Array.fill(5)("hello")
//   arr.foreach(println)
    
    val arr = Array(1,2,3)
		val arr1 = Array(4,5,6)
    
		val array = Array.concat(arr,arr1)
    array.foreach(println)
    
  }
}