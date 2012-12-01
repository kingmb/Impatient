 package chapter03
import scala.collection.mutable.ArrayBuffer
object Exercise06 {
  
  def main(args: Array[String]): Unit = {
    println(reverseSortArray(Array(2, -3, 4)).mkString(","))
    println(reverseSortArrayBuffer(ArrayBuffer(2, -3, 4)).mkString(","))
    println(reverseSortArray(Array(5, -56, 2, -3, 4)).mkString(","))
    println(reverseSortArrayBuffer(ArrayBuffer(5, -56, 2, -3, 4)).mkString(","))
  }
  
  def reverseSortArray(myArray: Array[Int]): Array[Int] = {
    scala.util.Sorting.quickSort(myArray)
    myArray.reverse
  }  
  def reverseSortArrayBuffer(myArray: ArrayBuffer[Int]): ArrayBuffer[Int] = {
  		myArray.sortWith(_ > _)
  }  
}