 package chapter03
import java.awt.datatransfer._
import scala.collection.mutable.Buffer
import scala.collection.JavaConversions.asScalaBuffer

object Exercise10 {
  
  def main(args: Array[String]): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    println(flavors.getNativesForFlavor(DataFlavor.imageFlavor).mkString(","))
    
  }
  
}