package chapter18

object Exercise09 {
  
  def main(args: Array[String]): Unit = {     
    
    abstract class Dim[T] (val value: Double, val name: String) {
      this: T => // This it is
      protected def create(v: Double): T
      def +(other: Dim[T]) = create(value + other.value)
      override def toString() = value + " " + name
    }
    
    class Seconds(v: Double) extends Dim[Seconds](v, "s") {
      override def create(v: Double) = new Seconds(v)
    }
    
//    class Meters(v: Double) extends Dim[Seconds](v, "m") {
//      override def create(v: Double) = new Seconds(v)
//    }
//    
//    val seconds = new Seconds(3)
//    val meters = new Meters(5)
//    
//    println(seconds + meters)
    
  }  
  
}