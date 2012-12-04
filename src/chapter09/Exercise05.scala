package chapter09
import scala.io.Source
import java.io.PrintWriter
object Exercise05 {
  
	def makeRow(number:Int)= {
		val pow = Math.pow(2, number).intValue()
    "%7d %s".format(pow, (1/pow.toDouble))
	}
  
  def main(args: Array[String]): Unit = {
    var writer = new PrintWriter("files\\Test09_05.txt")
    try { 
      for (i <- 0 to 20) writer.println(makeRow(i))     
    }
    finally { writer.close }
  }
  
}