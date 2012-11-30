package chapter08

object Exercise05 {
  
 class Point(val x: Double, val y: Double) {
    override def toString() = "(" + x + "-" + y + ")"
  }
 
 class LabeledPoint(label: String, x: Double, y: Double) extends Point(x,y) {
   override def toString() = label + ": " + super.toString
 }
 	
  def main(args: Array[String]): Unit = {
    val point = new Point(4,8)
  //  point.x = 2 a val is not assignable
    println(point)
    val labelPoint = new LabeledPoint("Black Thursday", 1929, 230.07)
    println(labelPoint)
  } 
}