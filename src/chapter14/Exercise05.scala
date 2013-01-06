package chapter14


object Exercise05 {
  
  def main(args: Array[String]): Unit = {  
    
    def leafSum(value: List[Any]): Int = {
      value match {
        case (x: Int) :: tail => x + leafSum(tail)
        case (x: List[Any]) :: tail => leafSum(x) + leafSum(tail)
        case _ => 0
      }
    }
    
    println(leafSum(List(3, 4, List(4, List(10)))))
  }
}