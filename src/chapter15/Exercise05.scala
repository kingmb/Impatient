package chapter15

import scala.io.Source

object Exercise05 {
  
  def concat(): String = {
  	Source.fromFile("files\\Test1.txt").mkString
  }

  
  def main(args: Array[String]): Unit = {  
    println(concat)
  }
}