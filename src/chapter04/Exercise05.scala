 package chapter04
import scala.collection.immutable._
import scala.collection.JavaConversions.mapAsScalaMap
import java.io.File

object Exercise05 {
  
  def main(args: Array[String]): Unit = {
    val erg = readWords("files\\Test1.txt")
    for ((k,v) <- erg) println(k + " / " + v)
  }
    
  def readWords(fileName: String) = {
    var iMap: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in = new java.util.Scanner(new java.io.File(fileName))
    while (in.hasNext()) {
      val next = in.next  	
      iMap = iMap + (next -> (iMap.getOrElse(next, 0) + 1))
    }
    iMap
  }  
}