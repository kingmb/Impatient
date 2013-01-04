package chapter13

import scala.collection.immutable.Map
import scala.collection.mutable.LinkedList

object Exercise03 {
  
  def main(args: Array[String]): Unit = {  

    def removeZero (in: LinkedList[Int]) = {
      in.filter(_ != 0)
    }
    
    var values = LinkedList(2,0,4,56,0,3)
    println(removeZero(values)) 
  }
}