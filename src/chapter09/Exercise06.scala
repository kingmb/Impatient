package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise06 {
  
  def main(args: Array[String]): Unit = {
    var in = Source.fromFile("files\\Test09_06.txt")
    try { 
      val input = in.mkString("")
      println(input)
      println("####################")
      val pattern = """"[^(\")"]+"""".r // Not okay
      for (found <- pattern.findAllIn(input)) println(found)
    }
    finally {
      in.close
    }
  }
  
}