 package chapter07


object Exercise07 {
  
 def main(args: Array[String]): Unit = {  
  import java.util.{HashMap => JavaHashMap}
  val javaHM = new JavaHashMap[String, Int]()
  javaHM.put("Hallo",34)
  javaHM.put("Sie", 45)
  import scala.collection.mutable.{HashMap => ScalaHashMap}
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

