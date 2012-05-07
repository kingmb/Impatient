package chapter02

object Exercise05 {

  def main(args: Array[String]): Unit = {
    countdown(2)
    countdown(5)
    countdown(1)
    countdown(0)
    countdown(-2)
  }
  
  def countdown(n: Int) = {
    for (i <- (0 to n).reverse) println(i)
    println("-----------------")
  }

}