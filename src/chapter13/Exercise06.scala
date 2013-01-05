package chapter13

object Exercise06 {
  
  def main(args: Array[String]): Unit = {  

    val lst = List(3,7,5,88)
    println((lst :\ List[Int]())(_ :: _)) // ReduceLeft with prepend, start at the end
    println((List[Int]() /: lst)(_ :+ _)) // ReduceRight with append, start at the front
    
    println((lst :\ List[Int]())((x: Int, y: List[Int]) => y :+ x)) // ReduceLeft with append, start at the end
    
  }
}