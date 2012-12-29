package chapter12

object Exercise02 {
  
  def main(args: Array[String]): Unit = {  

    val myArray = Array(2,53,1,-1234, 100, 2)
    println(myArray.toVector.reduceLeft((a, b) => a max b))
    // or shorter
    println(myArray.toVector.reduceLeft(_ max _))

  }
}