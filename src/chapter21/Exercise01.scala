package chapter21


object Exercise01 {
  
  def main(args: Array[String]): Unit = {  
    
    println("Hello" -> 42)
    
    //   @inline implicit def any2ArrowAssoc[A](x: A): ArrowAssoc[A] = new ArrowAssoc(x)
    // The string is implictly cast to ArrowAssoc
  }  
  
}