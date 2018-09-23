package com.xyg.obj

object Lesson_String {
  def main(args: Array[String]): Unit = {
//    val s = "bajsxt"
//		val s1 = "BJSXT"
//		
//		println(s.equals(s1))
//		println(s.equalsIgnoreCase(s1))
//		println(s.indexOf(97))
    
    val builder = new StringBuilder()
    builder.+('a')
    builder.++=("bc")
    builder.append(true)
    println(builder) // abctrue
  }
}