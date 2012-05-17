package chapter04
import scala.collection.JavaConversions.propertiesAsScalaMap

object Exercise09 {
  
  def main(args: Array[String]): Unit = {
    println(lteqgt(Array(3, 6, 2, 9, 3), 3))
    println(lteqgt(Array(1), 3))
    println(lteqgt(Array(), 3))
  }
    
  def lteqgt(values: Array[Int], v: Int):(Int, Int, Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }  
}