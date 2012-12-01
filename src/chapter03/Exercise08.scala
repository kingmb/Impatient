 package chapter03
import scala.collection.mutable.ArrayBuffer

object Exercise08 {
  
  def main(args: Array[String]): Unit = {
    println(removeAllNegativeNumberExceptFirst(ArrayBuffer(2, -3, 2, -4, -6, 7, 4)).mkString(","))
    println(dropAllBeforeFirstNegativeNumber(ArrayBuffer(2, 3, 2, -4, -6, 7, 4)).mkString(","))
  }
  
  def removeAllNegativeNumberExceptFirst(a: ArrayBuffer[Int]) = { 
    val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
   //Then we visit the indexes in reverse, except for indexes(0).
    for (j <- (1 until indexes.length).reverse) a remove indexes(j) 
    a
  }  
  def dropAllBeforeFirstNegativeNumber(a: ArrayBuffer[Int]) = { 
  	a.drop(a.indexWhere(_ < 0)) 
  }  
}