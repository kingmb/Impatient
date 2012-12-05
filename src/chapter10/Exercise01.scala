package chapter10

import java.awt.Rectangle
object Exercise01 {
  
  trait RectangleLike {
    def translate(dx: Int, dy: Int) = {
      val rec = new Rectangle(getX.intValue(), getY.intValue(), getWidth.intValue(), getHeight.intValue())
      rec.translate(dx, dy)
      setBounds(rec.getX, rec.getY, rec.getWidth, rec.getHeight);  
    }
    
    def grow(h: Int, v: Int) = {
      val rec = new Rectangle(getX.intValue(), getY.intValue(), getWidth.intValue(), getHeight.intValue())
      rec.grow(h, v)
      setBounds(rec.getX, rec.getY, rec.getWidth, rec.getHeight);        
    }
    
    // abstract methods
    def getX: Double
    def getY: Double
    def getWidth: Double
    def getHeight: Double   
    def setBounds(x: Double, y: Double, width: Double, height: Double): Unit
  }
  
  def main(args: Array[String]): Unit = {  
    val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike {
      def setBounds(x: Double, y: Double, width: Double, height: Double) = setFrame(x, y, width, height)
      override def toString = x + "-" + y + "-" + width + "-" + height
    }
    println(egg)
    egg.translate(10, -10)
    println(egg)
    egg.grow(10, 20)
    println(egg)
  }
  
}