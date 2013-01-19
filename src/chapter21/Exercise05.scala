package chapter21


object Exercise05 {
  
  def main(args: Array[String]): Unit = {  
    class Fraction(n: Int, d: Int) {
      override def toString() = n + " " + d
    }
    object Fraction {
      def apply(n: Int, d: Int) = new Fraction(n,d)
    }
    class RichFraction(val x: Fraction) extends Ordered[Fraction]{
      override def compare(o: Fraction) = 1
    }
    
    implicit def fractionToOrdered(from: Fraction) = new RichFraction(from)
    
    def smaller[T](a: T, b: T)(implicit order: T => Ordered[T])
      = if (order(a) < b) a else b
      
      
      
    println(smaller(10, 40))
    println(smaller(Fraction(1,7), Fraction(2,9)))
 
  }  
  
}