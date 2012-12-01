 package chapter06
import java.awt.Point

object Exercise08 {
  
	object RGB extends Enumeration {
	  val red = Value(1, "Red")
	  val green = Value(2, "Green")
	 	val blue = Value(3, "Blue")
	 	// and other
	}


  def main(args: Array[String]): Unit = {
    println(RGB.red)
    println(RGB.green)
    println(RGB.blue)
  }
}