package chapter18

import java.lang.Math._

object Exercise06 {
  
  def main(args: Array[String]): Unit = {     
    
    def transform(arr: Array[Int], value: Int): Int Either Int = {
      val arrWithIndex = arr.zipWithIndex
      val sortByDiff = arrWithIndex.sortBy((n: (Int, Int)) => abs(n._1 - value))
      val best = sortByDiff.head
      if (best._1 - value == 0) Right(best._2) else Left(best._2)
    }
    
    def print(either: Either[Int, Int]) = 
    	println(either match {
    		case Right(x) => "Found at " + x
    		case Left(x) => "Closest is at " + x
    	})
    

    val arr = Array(2,10,11,100)
    print(transform(arr, 4))
    print(transform(arr, 5))
    print(transform(arr, 6))
    print(transform(arr, 7))   
    print(transform(arr, 11)) 
    print(transform(arr, 500))
  }  
  
}