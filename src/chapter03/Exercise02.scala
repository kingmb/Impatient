package chapter03
object Exercise03 {
  
  def main(args: Array[String]): Unit = {
    val myA = Array(10,20,30,40,50)
    println(myA.mkString(","))
    println(swap(myA).mkString(","))
    
    val myB = Array(-3,5,17,50)
    println(myB.mkString(","))
    println(swap(myB).mkString(","))
    
    val myC = Array(-4)
    println(myC.mkString(","))
    println(swap(myC).mkString(","))       
  }		
  
  def swap(myArray: Array[Int]): Array[Int] = {
    for (i <- 1 until myArray.length if i % 2 != 0) { 
      var tmp = myArray(i-1)
      myArray(i-1) = myArray(i)
      myArray(i) = tmp
    }
    myArray
  }  
}