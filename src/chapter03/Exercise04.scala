package chapter03
object Exercise04 {
  
  def main(args: Array[String]): Unit = {
    println(reorderPositiveFirst(Array(2,0,5,-1,-4,5)).mkString(","))
    println(reorderPositiveFirst(Array(-1)).mkString(","))
    println(reorderPositiveFirst(Array(-1,2)).mkString(","))
  }
  
  def reorderPositiveFirst(myArray: Array[Int]): Array[Int] = {
    Array.concat(myArray.filter(_ > 0), myArray.filter(_ <= 0))
  }  
}