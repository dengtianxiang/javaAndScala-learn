package com.xyg.obj

object Lesson_Function {
  def main(args: Array[String]): Unit = {
    /**
     * 1.函数定义
     *  1).return 可以省略，一般也是省略的，如果不省略return，函数的返回值类型要显式的声明出来。
     *  2).如果方法体可以一行搞定，方法体外面的“{... }”可以省略
     *  3).函数的“=”如果省略，无论方法体计算结果是什么，都会被丢弃，返回Unit,如果方法想要有值返回，“=”不能省略
     */
//    def max(a:Int,b:Int)= if(a>b) a else b
//    def fun(a:Int,b:Int) {
//      a+b
//    }
//    
//    println(fun(10,32))
//    
    /**
     * 2.递归函数
     *  递归函数要声明函数的返回值类型
     */
//    def fun(num:Int):Int = {
//      if(num==1){
//        1
//      }else{
//        num*fun(num-1)
//      }
//    }
//    
//    println(fun(5))
    
   /**
    * 3.函数参数有默认值的函数
    */
//    def fun(a:Int=100,b:Int=200) = {
//      a+b
//    }
//    println(fun(11,22))
    
    /**
     * 4.有多个参数的函数
     */
//    def fun(ss:String*) = {
//      ss.foreach { println}
//      ss.foreach { println(_)}
//      for(s<-ss){
//        println(s)
//      }
//    }
//    
//    fun("hello","hello1","hello2")
    
    /**
     * 5.匿名函数
     * 匿名函数中不能显式的声明函数值返回类型
     * 
     */
//    val fun = ()=>{
//      println("hello world~")
//    }
//    
//    fun()
    
//    val fun = (s1:String,s2:String)=>{
//      s1+s2
//    }
//    
//    println(fun("hello","bjsxt"))
    
    /**
     * 6.嵌套函数
     */
//    def fun(num:Int) = {
//      
//      def fun1(a:Int):Int = {
//        if(a==1){
//          1
//        }else{
//          a*fun1(a-1)
//        }
//      }
//      
//      fun1(num)
//    }
//    
//    println(fun(5))
    
    /**
     * 7.偏应用函数
     */
//    def showLog(date:Date,log:String) = {
//      println("date is "+date+",log is "+log)
//    }
//    
//    val date = new Date()
////    showLog(date,"aaa")
////    showLog(date,"bbb")
////    showLog(date,"ccc")
//    
//    val fun = showLog(date:Date,_:String)
//    fun("a")
//    fun("b")
//    fun("c")
//    
    /**
     * 8.高阶函数
     *  1).函数的参数是函数
     *  2).函数的返回是函数
     *  3).函数的参数和返回都是函数
     * 
     */

//    def fun(a:Int,b:Int):Int ={
//      a+b
//    }
//    
//    //1).函数的参数是函数
//    def fun1(f:(Int,Int)=>Int,a:String) = {
//      f(10,11)+"~"+a
//    }
//    
//    println(fun1(fun,"hello"))
    
    //2).函数的返回是函数
    
//    def fun(a:Int,b:Int):(String,String)=>String = {
//      def fun1(s:String ,s1:String) :String= {
//        a+b+"~"+s+s1
//      }
//      fun1
//    }
//    
//    println(fun(1,2)("hello","world"))//3~helloworld
    
    //3).函数的参数和返回都是函数
//    def fun(f:(Int,Int)=>Int,a:Int):(Int,Int)=>Int = {
//      val r = f(10,20)
//      def fun1(x:Int,y:Int) :Int= {
//        r+x+y+a
//      }
//      fun1
//    }
//    
//    println(fun((a:Int,b:Int)=>{a*b},100)(1,2))//303
//    
    /**
     * 9.柯里化 函数
     *  高阶函数简化版
     */
//    def fun(a:Int,b:Int)(c:Int,d:Int)= {
//      a+b+c+d
//    }
//    
//    println(fun(1,2)(3,4))
    
  }
}