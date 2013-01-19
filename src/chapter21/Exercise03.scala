package chapter21


object Exercise03 {
  
  def main(args: Array[String]): Unit = {  
    
    class Factorial(val x: Int) {
    	def ! (): Int = if (x == 0) 1 else x * (new Factorial(x-1)!)   
    }
    
    implicit def intToFactorial(x: Int) = new Factorial(x)
    
    println(5!)
 
  }  
  
}