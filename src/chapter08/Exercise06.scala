package chapter08
import chapter08.Exercise05.Point

object Exercise06 {
  
 abstract class Shape() {
    def centerPoint: Point
  }
 
 class Rectangle(corner: Point, width: Double) extends Shape {
   override def centerPoint = new Point(corner.x + (width / 2), corner.y + (width/2))
 }
 
 class Cirle(center: Point, radius: Double) extends Shape {
   override def centerPoint = center
 }
 	
  def main(args: Array[String]): Unit = {
    val startPoint = new Point(10, 50)
    println(new Rectangle(startPoint, 20).centerPoint)
    println(new Cirle(startPoint, 20).centerPoint)    
  } 
}