package chapter21

import scala.Predef._
object Exercise10 {
  
  def main(args: Array[String]): Unit = {  
    
  		println("abc".map(_.toUpper))
  		
  		println("abc".map(_.toInt)) // Because of the CanBuildFrom  Provider for int values in ???
  }  
  
}