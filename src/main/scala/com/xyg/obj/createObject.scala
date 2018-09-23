package com.xyg.obj

import com.xyg.cas.Person

/**
  * Author: Mr.Deng
  * Date: 2017/5/13
  * Desc: 创建对象
  */
object createObject {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    println(person.age);
    println(person.sayName())
  }

}
