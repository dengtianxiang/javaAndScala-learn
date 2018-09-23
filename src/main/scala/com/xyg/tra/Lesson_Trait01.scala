package com.xyg.tra

trait Speak{
  val tp = "speak"
  def speak(name:String) = {
    println(name+" is speaking... ")
  }
}
trait Listen{
	val tp = "listen"
	def listen(name:String) = {
		println(name+" is listening... ")
	}
}

class Person1() extends Speak with Listen{
  override val tp = "person"
}

object Lesson_Trait01 {
  def main(args: Array[String]): Unit = {
    val p = new Person1()
    p.speak("zhangsan")
    p.listen("lisi")
    println(p.tp)
  }
}