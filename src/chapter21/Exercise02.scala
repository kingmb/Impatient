package chapter21


object Exercise02 {
  
  def main(args: Array[String]): Unit = {  
    
    class Prozent(val x: Int) {
    	def +% (p: Int) = x + (x * p / 100)      
    }
    
    implicit def intToProzent(x: Int) = new Prozent(x)
    
    println(120 +% 10)
 
  }  
  
}