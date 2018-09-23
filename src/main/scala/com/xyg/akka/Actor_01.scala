package com.xyg.akka

import akka.actor.Actor

/**
  * Author: Mr.Deng
  * Date: 2017/5/13
  * Desc:
  *
  * 1.概念理解
  * Actor Model是用来编写并行计算或分布式系统的高层次抽象,
  * （类似java中的Thread）让程序员不必为多线程模式下共享锁而烦恼,被用在Erlang 语言上,
  * 高可用性99.9999999 % 一年只有31ms 宕机Actors将状态和行为封装在一个轻量的进程/线程中，
  * 但是不和其他Actors分享状态，每个Actors有自己的世界观，当需要和其他Actors交互时，通过发送事件和消息，
  * 发送是异步的，非堵塞的(fire-andforget)，发送消息后不必等另外Actors回复，也不必暂停，
  * 每个Actors有自己的消息队列，进来的消息按先来后到排列，这就有很好的并发策略和可伸缩性，
  * 可以建立性能很好的事件驱动系统。
  *
  * 2.Actor的特征：
  * ActorModel是消息传递模型,基本特征就是消息传递
  * 消息发送是异步的，非阻塞的
  * 消息一旦发送成功，不能修改
  * Actor之间传递时，自己决定决定去检查消息，而不是一直等待，是异步非阻塞的
  *
  * 什么是Akka
  * Akka 是一个用 Scala 编写的库，用于简化编写容错的、高可伸缩性的 Java 和Scala 的 Actor 模型应用，
  * 底层实现就是Actor,Akka是一个开发库和运行环境，可以用于构建高并发、分布式、可容错、事件驱动的基于JVM的应用。使构建高并发的分布式应用更加容易。
  * spark1.6版本之前，spark分布式节点之间的消息传递使用的就是Akka，底层也就是actor实现的。1.6之后使用的netty传输。
  *
  *
  */
class MyActor extends Actor {
  override def receive: Receive = {
        case s:String => println("s = "+s)
        case _=>println("no match ...")
  }
}

object Actor01 {
  def main(args: Array[String]): Unit = {

    val actor = new MyActor()

  }

}