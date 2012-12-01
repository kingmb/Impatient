 package chapter02

object Exercise07 {

  def main(args: Array[String]): Unit = {
    println(sumUnicode("Hello") == 825152896)
  }
  
  def sumUnicode(s: String): Long = {
    val prod = s.foldLeft(1)(_.toInt*_.toInt)
    val prod2 = s.foldLeft(1)(_ * _)
    println(prod == prod2)
    println(prod)
    prod   
  }

}