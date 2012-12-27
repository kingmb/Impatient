package chapter11

import scala.io.Source
import java.io.File

object Exercise10 {
  
  class RichFile(val path: String, val name: String, val extension: String) {
  }
  object RichFile {
  	def unapplySeq(input: RichFile): Option[Seq[String]] = {
  	  Some(input.path.trim.split("\\\\").toList ::: List(input.name + "." + input.extension))
  	}  
  }
  

  def main(args: Array[String]): Unit = { 
   val rf = new RichFile("files\\man", "Test1", "txt")
   rf match {
      case RichFile("files", "Test1.txt") => println("found")
      case _ => println("not found")
    }
   val rf2 = new RichFile("files\\man", "Test1", "txt")
   rf2 match {
      case RichFile("files", "man", "Test1.txt") => println("found")
      case _ => println("not found")
    }
  }
  
}