package chapter11

import scala.io.Source
import java.io.File

object Exercise09 {
  
  case class RichFile(path: String, name: String, extension: String) {
  	def read = Source.fromFile(new File(path + "\\" + name + "." + extension).getPath).mkString 	
  }
  class RichFile2(val path: String, val name: String, val extension: String) {
  	def read = Source.fromFile(new File(path + "\\" + name + "." + extension).getPath).mkString 	
  }
  object RichFile2 {
    def apply(path: String, name: String, extension: String) = new RichFile2(path, name, extension)
    def unapply(input: RichFile2) = {
      Some((input.path, input.name, input.extension))
    }
  }

  def main(args: Array[String]): Unit = { 
    val rf = RichFile("files", "Test1", "txt")
    println(rf.read)
    val RichFile(p,n,e) = rf
    println(p)
    println(n)
    println(e)
    
    val rf2 = RichFile2("files", "Test1", "txt")
    println(rf2.read)
    val RichFile2(p2,n2,e2) = rf2
    println(p2)
    println(n2)
    println(e2)
  }
  
}