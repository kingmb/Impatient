package chapter14


object Exercise02 {
  
  def main(args: Array[String]): Unit = {  
    
    def swap(pair: (Int, Int)): (Int, Int) = 
      pair match {
      case (x,y) => (y,x)
    }
    
    println(swap(3,7))
  }
}