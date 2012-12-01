 package chapter04
import scala.collection.mutable._
import java.io.File

object Exercise02 {
  
  def main(args: Array[String]): Unit = {
    val erg = readWords("files\\Test1.txt")
    for ((k,v) <- erg) println(k + " / " + v)
  }
    
  def readWords(fileName: String) = {
    val mutableMap = new scala.collection.mutable.HashMap[String, Int]
    val in = new java.util.Scanner(new java.io.File(fileName))
    while (in.hasNext()) {
      val next = in.next
    	mutableMap.put(next, mutableMap.getOrElse(next, 0) + 1)
    }
    mutableMap
  }
  
}