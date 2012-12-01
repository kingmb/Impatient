package chapter08
import chapter08.Exercise05.Point

object Exercise07 {
  
 class Square(corner: Point, width: Double) extends java.awt.Rectangle(corner.x.intValue, corner.y.intValue, width.intValue, width.intValue) {
    def this(width: Double) = this(new Point(0,0), width)
    def this() = this(0)
    override def toString = corner + "-" + getWidth() + "-" + getHeight() 
  }
 
 	
  def main(args: Array[String]): Unit = {
    println(new Square)
    println(new Square(4))
    println(new Square(new Point(3,65), 4))
  } 
}