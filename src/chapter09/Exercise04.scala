package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise04 {
  
  def main(args: Array[String]): Unit = {
    var in = Source.fromFile("files\\TestFloat.txt")
    try { 
      val floats = in.mkString.split("\\s+") 
      val numbers = floats.map(_.toDouble)
      println("Sum: " + numbers.sum)
      println("Average: " + numbers.sum / numbers.length)
      println("Max: " + numbers.max)
      println("Min: " + numbers.min) 
    }
    finally {
      in.close
    }
  }
  
}