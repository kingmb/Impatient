package chapter16

import xml._

object Exercise04 {
  
  def main(args: Array[String]): Unit = {  
    val myFile = XML.loadFile("files\\xhtml.html")
    val allImages = myFile \\ "img"
    for (img <- allImages) {
      img match {
        case next @ <img/> if (next.attributes("alt") == null) => println("Without alt: " + next)
        case n @ _ => println("With alt: " + n)
      }
    }
  }  
  
}