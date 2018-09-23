package com.xyg.obj

object Lesson_Map {
  def main(args: Array[String]): Unit = {
//    val map = Map(1->"a",2->"b",(3,"c"),(3,"ccc"))
//		val result = map.get(2).getOrElse("xxx")
//    println(result)
    //遍历
//    map.foreach(println)
//    for(elem<-map){
//      println(elem)
//    }
    
    //遍历key
//   val keys = map.keys
//   for(key<-keys){
//     println("key = "+key+",value="+map.get(key).get)
//   }
    //遍历values
//    val values = map.values
//    
//    for(value<-values){
//      println(value)
//    }
    
    val map = Map((1,"a"),(2,"b"),(3,"c"))
		val map1 = Map((1,"aaa"),(2,"bbb"),(4,"ddd"))
//		val result = map.++:(map1)
		val result = map.++(map1)
		
    result.foreach(println)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}