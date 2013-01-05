package chapter13

import scala.collection.immutable.Map

object Exercise07 {
  
  def main(args: Array[String]): Unit = {  

    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)
    
    println((prices zip quantities) map (p => p._1 * p._2))
    println((prices zip quantities) map (Function.tupled(_ * _)))  
  }
}