package chapter01
import scala.math._
import scala.BigInt._
import scala.util.Random
object Exercises {

  def main(args: Array[String]): Unit = {
    println("-------------- Exercise 2 -------------")
    val wurzel3 = sqrt(3)
    println(wurzel3 * wurzel3)
    
    println("-------------- Exercise 4 -------------")
    println("crazy" * 3)
    
    println("-------------- Exercise 5 -------------")
    println(10 max 2)    
    
    println("-------------- Exercise 6 -------------")
    println(2 pow 1024)   
    
    println("-------------- Exercise 7 -------------")
    println(probablePrime(100, Random))    
    
    println("-------------- Exercise 8 -------------")
    println(probablePrime(100, Random).toString(36))
    
    println("-------------- Exercise 9 -------------")
    val value = "Hallo"
    println("First = " + value.head + " Last = " + value.last) 
    
    println("-------------- Exercise 10 -------------")
    println(value.take(2))   
    println(value.drop(2))  
    println(value.takeRight(2))   
    println(value.dropRight(2))      
  }

}