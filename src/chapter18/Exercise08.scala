package chapter18

import java.lang.Math._

object Exercise08 {
  
  def main(args: Array[String]): Unit = {     
    
    def printValues(f: {def apply(in: Int): Int}, from: Int, to: Int) = {
      for (i <- from to to) print(f(i) + " ")
    }
    
    printValues((x: Int) => x * x, 3, 6)
    println("")
    println("#################")
    printValues(Array(1,1,2,3,5,8,13,21,34,55), 3, 6)
  }  
  
}