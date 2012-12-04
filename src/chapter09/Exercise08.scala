package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise08 {
  
  def main(args: Array[String]): Unit = {
    var in = Source.fromURL("http://kicker.de", "ISO-8859-1")
    try { 
      val input = in.mkString("")
      val pattern = """<img[^src="]+src="([^"]+)""".r
      for (pattern(src) <- pattern.findAllIn(input)) println(src)
    }
    finally {
      in.close
    }
  }
  
}