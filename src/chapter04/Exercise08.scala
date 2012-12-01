package chapter04

object Exercise08 {
  
  def main(args: Array[String]): Unit = {
    println(minmax(Array(3, 6, 2, 9, 3)))
  }
    
  def minmax(values: Array[Int]):(Int, Int) = {
    (values.min, values.max)
  }  
}