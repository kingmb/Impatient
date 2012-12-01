 package chapter03
object Exercise02 {
  
  def main(args: Array[String]): Unit = {
    val myA = Array(10,20,30,40,50)
    println(myA.mkString(","))
    println(swap(myA).mkString(","))
    
    val myB = Array(-3,5,17,50)
    println(myB.mkString(","))
    println(swap(myB).mkString(","))
    
    val myC = Array(-3)
    println(myC.mkString(","))
    println(swap(myC).mkString(","))    
  }
  
  
  def swap(myArray: Array[Int]): Array[Int] = {
    (for (i <- 0 until myArray.length)
      yield 
        if(i % 2 == 0 && i == myArray.length - 1) myArray(i) // Das letzte ist ungerade und hat kein Pendant
        else if (i % 2 == 0) myArray(i + 1) // Gerade
        else myArray(i-1) // Ungerade
     ).toArray       
  }  
}