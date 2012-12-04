package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise03 {
  
  def main(args: Array[String]): Unit = {
    for (nextWord <- Source.fromFile("files\\Test1.txt").mkString.split("\\s+") if nextWord.length > 12) { println(nextWord)}
  }
  
}