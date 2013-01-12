package chapter17


object Exercise06 {
  
  def main(args: Array[String]): Unit = {  
    
    def middle[T](it: Iterable[T]): T = {
      val rest = it drop(it.size/2)
      rest.head
    }
    
    println(middle("World"))
    println(middle("W"))
    println(middle(List(2,4,7)))
    println(middle(Array("A", 8, "I")))
  }  
  
}