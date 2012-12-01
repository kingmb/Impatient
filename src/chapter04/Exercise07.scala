 package chapter04
import scala.collection.JavaConversions.propertiesAsScalaMap

object Exercise07 {
  
  def main(args: Array[String]): Unit = {
    println(printJavaProperties)
  }
    
  def printJavaProperties = {
    val props: scala.collection.mutable.Map[String, String] = System.getProperties
    val maxLengthKey:String = props.keySet.reduceLeft((a, b) => if (a.length > b.length) a else b)
    val maxLengthKey2 = props.keySet.toList.maxBy(_.size)
    val maxLengthKey3 = props.keySet.maxBy(_ size)
    println(maxLengthKey2.length)
    println(maxLengthKey3.length)
    for((k,v) <- props) {
      val missingSpace: String = " " * (maxLengthKey.length - k.length)
      println(k + missingSpace + "| " + v) 
    }
  }  
}