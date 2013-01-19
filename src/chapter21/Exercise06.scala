package chapter21

import java.awt.Point

object Exercise06 {
  
  def main(args: Array[String]): Unit = {  
    class RichPoint(val x: Point) extends Ordered[Point]{
      override def compare(o: Point) = x.toString compare o.toString()
    }
    
    implicit def pointToOrdered(from: Point) = new RichPoint(from)
    
    def smaller[T](a: T, b: T)(implicit order: T => Ordered[T])
      = if (order(a) < b) a else b
      
          
    println(smaller(10, 40))
    println(smaller(new Point(3443,5557), new Point(4,2)))
    println(smaller(new Point(5,1), new Point(4,2)))

 
  }  
}