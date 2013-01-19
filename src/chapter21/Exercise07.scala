package chapter21

import java.awt.Point
import scala.math.abs

object Exercise07 {
  
  def main(args: Array[String]): Unit = {  
    class RichPoint(val x: Point) extends Ordered[Point]{
      override def compare(o: Point) = x.toString compare o.toString()
    }
        
    
    class RichPointToOrigin(val x: Point) extends Ordered[Point]{
      override def compare(o: Point) = abs(x.getX()) + abs(x.getY()) compare abs(o.getX()) + abs(o.getY())
    }
    object PointConversions {
    	implicit def pointToOrdered(from: Point) = new RichPoint(from)
    	implicit def pointOriginToOrdered(from: Point) = new RichPointToOrigin(from)
    }

    //  Change the import here 
    import PointConversions.pointToOrdered  
    
    def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) = {
      if (order(a) < b) a else b
    }
      
          
    println(smaller(10, 40))
    println(smaller(new Point(5,1), new Point(40,2)))

 
  }  
  
}