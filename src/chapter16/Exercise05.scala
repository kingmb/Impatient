package chapter16

import xml._

object Exercise05 {
  
  def main(args: Array[String]): Unit = {  
    val myFile = XML.loadFile("files\\xhtml.html")
    val allImages = myFile \\ "img"
    for (img <- allImages) { println(img attribute("src") get) }
  }  
  
}