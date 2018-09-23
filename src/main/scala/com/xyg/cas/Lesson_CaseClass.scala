package com.xyg.cas

case class Human(xname:String,yage:String)

object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val h1 =  Human("zhangsan","18")
    val h2 =  Human("zhangsan","18")
//    println(h1.xname)
    println(h1==h2)
  }
}