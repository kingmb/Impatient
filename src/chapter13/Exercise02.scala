package chapter13

import scala.collection.mutable.SortedSet
import scala.collection.immutable.Map

object Exercise02 {
  
  def main(args: Array[String]): Unit = {  

    def indexes (in: String) = {
      val charsWithIndex = in.zipWithIndex
      charsWithIndex.foldLeft(Map[Character, SortedSet[Int]]())((m,c) => m + (new Character(c._1) -> (m.getOrElse(c._1, SortedSet[Int]()) + c._2)))    
    }
    
    val erg = indexes("Mississippi")
    for ((k, v) <- erg) println(k + " -> " + v)
  }
}