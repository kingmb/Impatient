package chapter12

object Exercise08 {
  
  def main(args: Array[String]): Unit = {  

    val a = Array("Hello", "You")
    val b = Array(5, 3)
    val c = Array(5)
    val d = Array(4, 3)
    println(a.corresponds(b)(_.length == _)) // OK
    println(a.corresponds(c)(_.length == _)) // FALSE
    println(a.corresponds(d)(_.length == _)) // FALSE
  }
}