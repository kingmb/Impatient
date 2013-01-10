package chapter16

import xml._

object Exercise06 {
  
  def main(args: Array[String]): Unit = {  
    val myFile = XML.loadFile("files\\xhtml.html")
    val allRefs = myFile \\ "a"
    for (link <- allRefs) { println(link attribute("href") get) }
  }  
  
}