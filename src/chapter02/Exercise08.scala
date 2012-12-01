package chapter02

object Exercise08 {

  def main(args: Array[String]): Unit = {
    println(product("Hello") == 825152896)
  }
  
  def product(s: String): Long = {
    val prod = s.foldLeft(1)(_.toInt*_.toInt)
    val prod2 = s.foldLeft(1)(_ * _)
    println(prod == prod2)
    println(prod)
    prod   
  }

}