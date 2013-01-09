package chapter15

import scala.annotation.varargs

object Exercise04 {
  
  @varargs def sum(in: Int*) = println (in sum)
  
  def main(args: Array[String]): Unit = {  
    sum(3,5,20)
    
  }
}