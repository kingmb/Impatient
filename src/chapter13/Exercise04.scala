package chapter13

import scala.collection.mutable.SortedSet
import scala.collection.immutable.Map

object Exercise04 {
  
  def main(args: Array[String]): Unit = {  

    def convert (str: Iterable[String], values: Map[String, Int]): Iterable[Int] = {
      val valuesInString: Map[String, Int] = values.filter((v) => str.exists(c => c.equals(v._1)))
      valuesInString.map(x => x._2)      
    }
    
    val names = Array("Tom", "Fred", "Harry")
    val values = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
    println(convert(names, values))
  }
}