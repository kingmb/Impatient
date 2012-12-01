 package chapter06
import java.awt.Point

object Exercise04 {


	class Point private(private val x: Int, private val y: Int) {
	  override def toString() = x + "-" + y
	}
	
	object Point {
	  def apply(x: Int, y: Int) = new Point(x, y)
	}

  def main(args: Array[String]): Unit = {
   // not allowed:  new Point(3,4)
    println(Point(3,4))
  }

}