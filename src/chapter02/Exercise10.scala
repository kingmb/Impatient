 package chapter02

object Exercise10 {
  
  def main(args: Array[String]): Unit = {
    val prod = myPow(2.5,4)
    println(prod)
    println(prod == 39.0625)
  }
  
  def myPow(x: Double, n: Int) : Double = {
  		n match {
      	case 0 => 1
      	case _ if (n > 0) => {
      	      if (n % 2 == 0) {
      	        if ( n == myPow(x, n/2)) myPow(n, 2)
      	        else scala.math.pow(x, n)
      	      }
      	      else { x * myPow(x, n-1)}
      	}
      	case _ if (n < 0) => 1 / myPow(x, -n)
  		}
   }
}