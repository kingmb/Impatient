package chapter14


object Exercise10 {
  
  def main(args: Array[String]): Unit = {  
    type T = Double => Option[Double]
    
    def compose(f: T, g: T): T = {
    	(x: Double) => 
    	  f(x) match {
    	    case None => None
    	    case Some(_) => g(x)
    	  }
    } 
    
    def f(x: Double) = if (x > 0) Some(java.lang.Math.sqrt(x)) else None
    def g(x: Double) = if (x != 1) Some(1 / (x-1)) else None
    val h = compose(f, g)
    println(h(2))
    println(h(1))
    println(h(0))
  }
}