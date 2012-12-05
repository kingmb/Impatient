package chapter10

import java.awt.Point
object Exercise02 {
  
  class OrderedPoint(x: Int, y:Int) extends Point(x,y) with Ordered[Point] {
    override def compare(that: Point) = 
    	if (getX < that.getX) -1
    	else if (getX == that.getX) {
    	  if (getY < that.getY) -1
    	  else if (getY == that.getY) 0
    	  else 1
    	}
    	else 1
  }
  
  def main(args: Array[String]): Unit = {  
    val small = new OrderedPoint(1, 2)
    val large = new OrderedPoint(100, 200)
    println(small)
    println(large)
    println(small.compare(small) == 0)
    println(small.compare(large) < 0)
    println(large.compare(small) > 0)
    println(large.compare(large) == 0) 
  }
  
}