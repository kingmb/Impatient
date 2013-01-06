package chapter14


object Exercise09 {
  
  def main(args: Array[String]): Unit = {  
    
    def sum(in: List[Option[Int]]): Int = {
      in.flatten.sum
    }
    
    println(sum(List(None, Option(3), Option(2), None, Option(10))))    
  }
}