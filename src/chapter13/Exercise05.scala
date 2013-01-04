package chapter13

import scala.collection.mutable.SortedSet
import scala.collection.immutable.Map

object Exercise05 {
  
  def main(args: Array[String]): Unit = {  

    def myMkString (str: List[String], sep: String) = {
      str.reduceLeft((s1, s2) => s1 + sep + s2)
    }
    
    val name = List("Hallo", "Sie", "da")
    val sep = " "
    println(name.mkString(sep))
    println(myMkString(name, sep))
  }
}