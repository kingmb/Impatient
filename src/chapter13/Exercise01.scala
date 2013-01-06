package chapter13
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.SortedSet
import scala.collection.mutable.Set

object Exercise01 {
  
  def main(args: Array[String]): Unit = {  

    def indexes (in: String) = {
      val back = Map[Character, SortedSet[Int]]()
      if (in.length() > 0) {
        for (i <- 0 until in.length) {
        	val nextChar = in(i)          
        	back(nextChar) = back.getOrElse(nextChar, SortedSet[Int]()) + i
      	}
      }
      back
    }
    
    val erg = indexes("Mississippi")
    for ((k: Character, v: SortedSet[Int]) <- erg) println(k + " -> " + v)
  }
}