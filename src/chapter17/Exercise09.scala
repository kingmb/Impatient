package chapter17


object Exercise09 {
  
  def main(args: Array[String]): Unit = {  
    class Person(val in: Int) {
      override def toString = "Person: " + in
    }
    class Student(in: Int) extends Person(in) {
      override def toString = "Student: " + in
    }
    
    class Pair[+T](val first: T, val second: T) {
   //   def replaceFirst (newFirst: T) = new Pair[T](newFirst, second)
      override def toString = first + " # " + second
    }
    
    class NastyDoublePair(first: Double, second: Double) extends Pair[Double](first, second) {
   //   override def replaceFirst(newFirst: Double) = new Pair(first, scala.math.sqrt(newFirst)) 
    }
    
    val any: Pair[Any] = new NastyDoublePair(2.4, 5.6)
 //   any.replaceFirst("Hello")
  }  
  
}