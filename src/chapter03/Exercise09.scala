 package chapter03
import scala.collection.mutable.ArrayBuffer

object Exercise09 {
  
  def main(args: Array[String]): Unit = {
    val allZones: Array[String] = java.util.TimeZone.getAvailableIDs()
    println(allZones.mkString("\n"))
    println("\n\n--------------------------\n\n")
    println(allZones
    .filter(_ startsWith "America/")
    .map(_.substring("America/".length))
    .sortWith(_ < _)  
    .mkString("\n"))
  }
  
}