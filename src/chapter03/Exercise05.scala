 package chapter03
object Exercise05 {
  
  def main(args: Array[String]): Unit = {
    println(averageDoubleArray(Array(2, 4)) == 3.0)
    println(averageDoubleArray(Array(2.5, -0.5)) == 1.0)
    println(averageDoubleArray(Array(2.5, -0.5, 7)) == 3.0)
    println(averageDoubleArray(Array(1.4, 3.6)) == 2.5)
  }
  
  def averageDoubleArray(myArray: Array[Double]): Double = {
    myArray.sum / myArray.length
  }  
}