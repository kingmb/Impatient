 package chapter07

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}

object Exercise06 {
  
 def main(args: Array[String]): Unit = {  
  val javaHM = new JavaHashMap[String, Int]()
  javaHM.put("Hallo",34)
  javaHM.put("Sie", 45)
  
  val scalaHM = ScalaHashMap.empty[String, Int]
  val allEntriesIt = javaHM.entrySet().iterator()
  
  while(allEntriesIt.hasNext()) {
    val entry: java.util.Map.Entry[String, Int] = allEntriesIt.next()
    scalaHM += (entry.getKey() -> entry.getValue())
  }
  
  println(javaHM.toString())
  println(scalaHM.toString())
  
 }
}

