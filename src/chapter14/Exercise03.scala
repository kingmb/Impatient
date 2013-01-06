package chapter14


object Exercise03 {
  
  def main(args: Array[String]): Unit = {  
    
    def swap(ints: Array[Int]): Array[Int] = {
      ints match {
      	case Array(x, y, z @ _*) if (ints.length >= 2) => Array(y, x) ++ z
      	case _ => ints
    	}
    }
    
    println(swap(Array(3,7,4,5,5,6)).mkString(","))
  }
}