package chapter12

object Exercise04 {

  def main(args: Array[String]): Unit = {
    def factorialOrg(n: Int): Int = {
      if (n == 0) 1 else n * factorialOrg(n - 1)
    }
    
    def factorial(n: Int): Int = {
      (1 to n).foldLeft(1)(_ * _)
    }
    
    println(factorialOrg(0))
    println(factorialOrg(4))
    println(factorialOrg(10))

    println(factorial(0))
    println(factorial(4))
    println(factorial(10))    
  }

}