package chapter12

object Exercise09 {
  
  def main(args: Array[String]): Unit = {  
    
    def correspondsWithCurry[A, B](a: Seq[A], b: Seq[B])(p: (A, B) => Boolean): Boolean = {
      a.corresponds(b)(p)
    }
    def correspondsWithoutCurry[A, B](a: Seq[A], b: Seq[B], p: (A, B) => Boolean): Boolean = {
      a.corresponds(b)(p)
    }
    
    val a = Array("Hello", "You")
    val b = Array(5, 3)
    println(correspondsWithCurry(a, b)(_.length == _))
    // missing parameter type for expanded function ((x$3, x$4) => x$3.length.$eq$eq(x$4))	
    // println(correspondsWithoutCurry(a, b,_.length == _)) 
    // Because of that, the type is necessary
    println(correspondsWithoutCurry(a, b,(x: String, y: Int) => x.length == y))
  }
}