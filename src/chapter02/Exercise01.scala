package chapter02

object Exercise01 {

  def signum(i: Int) : Int = {
    if (i > 0) 1 
    else if (i == 0)  0 
    else -1
  }
  
  def main(args: Array[String]): Unit = {
    println(signum(-2))
    println(signum(0))
    println(signum(2))
  }

}