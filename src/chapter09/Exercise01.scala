package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise01 {
  
  def main(args: Array[String]): Unit = {
    var in = Source.fromFile("files\\Test2.txt")
    try { 
      val erg = in.getLines.toArray.reverse
      var writer = new PrintWriter("files\\Test2.txt")
      try { for (line <- erg) writer.println(line)}
      finally { writer.close }
    }
    finally {
      in.close
    }
  }
  
}