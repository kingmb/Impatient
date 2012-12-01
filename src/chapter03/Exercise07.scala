package chapter03
object Exercise07 {
  
  def main(args: Array[String]): Unit = {
    println(removeDuplicate(Array(2, -3, 2, 4, 4)).mkString(","))
    println(removeDuplicate(Array(5, 5)).mkString(","))
    println(removeDuplicate(Array("Hallo", "Ande", "Ande")).mkString(","))
  }
  
  def removeDuplicate[B <: Any] (myArray: Array[B]) = { // Mit Upper-Bound, also ist es abgeleitet oder enthält Any
    myArray.distinct
  }  
}