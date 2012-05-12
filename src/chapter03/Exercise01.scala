package chapter03

object Exercise01 {
  
  def main(args: Array[String]): Unit = {
    println(createArray(4))
    println(createArray(-1))
  }
  
  def createArray(size: Int)= {
    for (i <- 0 to size-1) yield i
  }  
}