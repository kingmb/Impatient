package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise02 {
  
  def main(args: Array[String]): Unit = {
    var in = Source.fromFile("files\\TestTab.txt")
    try { 
      val erg = in.getLines.toBuffer
      var writer = new PrintWriter("files\\TestTab.txt")
      // I don't understand what he want, so make it easy
      try { for (line <- erg) writer.println(line replace("\t", " "))}
      finally { writer.close }
    }
    finally {
      in.close
    }
  }
  
}