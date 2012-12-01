 package chapter03

import scala.util.Random
object Exercise01 {
  
  def main(args: Array[String]): Unit = {
    println(createArray(4))
    println(createArray(-1))
  }
  
  def createArray(size: Int)= {
    for (i <- 0 until size) yield Random.nextInt(size)
  }  
}