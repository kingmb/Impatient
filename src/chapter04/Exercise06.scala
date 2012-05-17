package chapter04
import scala.collection.immutable._
import scala.collection.JavaConversions.mapAsScalaMap
import java.io.File
import scala.collection.mutable.LinkedHashMap

object Exercise06 {
  
  def main(args: Array[String]): Unit = {
    println(createDayMap)
  }
    
  def createDayMap = {
    var map = new LinkedHashMap[String, Int]
    map += "Monday" -> java.util.Calendar.MONDAY
    map += "Thursday" -> java.util.Calendar.THURSDAY
    map += "Sunday" -> java.util.Calendar.SUNDAY
  }  
}