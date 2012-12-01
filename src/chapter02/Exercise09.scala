 package chapter02

object Exercise09 {
  
  def main(args: Array[String]): Unit = {
    val prod = product(1, "Hello")
    println(prod == 825152896)
  }
  
  def product(sum: Int, s: String) : Long = {
    println("----" + s.length)
    if (s.length == 0) sum 
    else {
      println(s(0).toInt)
      println(sum * s(0).toInt)
    	product(sum * s(0).toInt, s.slice(1, s.length))
    }
  }  

}