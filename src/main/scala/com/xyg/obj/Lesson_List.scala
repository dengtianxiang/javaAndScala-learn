package com.xyg.obj

object Lesson_List {

  def main(args: Array[String]): Unit = {
    //定义
    val list = List[Int](1,2,3,4,5,6)
    //遍历
    list.foreach(println)
    for(elem<-list){
      println(elem)
    }
    val result = list.filter { _>4}
    result.foreach(println)
//    val result = list.count {x=>{ x>2}}
//    val result = list.count { _>2}
//    println(result)
//
    /**
     * 方法
     * 
     */
//    val list = List("hello bjsxt","hello shsxt","hello gzsxt")
//    val result = list.flatMap { s => {s.split(" ")} }
//    
//    result.foreach(println)
    
//    val result = list.map { s =>{s.split(" ")} }
//    
//    result.foreach { array => {
//        println("******")
//        array.foreach { println }
//      } }

  }
}