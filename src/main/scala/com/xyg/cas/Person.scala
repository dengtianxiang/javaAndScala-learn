package com.xyg.cas

/**
  * Author: Mr.Deng
  * Date: 2017/5/13
  * Desc: 创建类
  * 变量 :用 var 定义 ，可修改
  * 常量 :用 val 定义，不可修改
  * 定义变量或者常量的时候，也可以写上返回的类型，一般省略
  * 1.scala中有分号自动推断 ，一句话之后可以省略分号，但是如果一行中有多个语句，分号不能省略,变量的类型可以省略不写，会自动推断。
  * 2.scala建议写代码符合驼峰命名法，object 是scala中的对象，scala中的单例对象，类比java中工具类，里面声明定义的都是静态的。
  * 3.scala中class与object可以写到一个文件中，但是类不能重名。在同一个scala文件中，class与object可以名称一致，这个class就叫做这个object的伴生类， 这个object就叫这个class的伴生对象，他们之间可以互相访问私有变量
  * 4.scala中class如果传参就有了默认的构造方法,重写构造，构造方法中第一行先调用默认构造。class中的属性自带getter，setter方法。
  * 5.同一个包下的所有的scala文件相当于写在一个大的文本文件中。
  * 6.scala类可以传参，object不能传参,Trait不能传参 7.当new class时，类中除了方法（不包含构造）不执行，其他都执行.
  */


class Person {
  val name = "zhangsan"
  val age = 18
  def sayName() = {
    "my name is "+ name
  }
}