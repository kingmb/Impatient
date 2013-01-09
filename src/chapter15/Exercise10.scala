package chapter15

import scala.io.Source

object Exercise10 {

  
  def main(args: Array[String]): Unit = {  
    def factorial(n: Int): Int = {
      assert(n >= 0)
      if (n == 0) 1 else n * factorial(n - 1)
    }
    
    factorial(-1)
    
  }
}