package chapter16

import xml._
import scala.xml.transform.RewriteRule

object Exercise09 {
  
  def main(args: Array[String]): Unit = {  
    val myFile = XML.loadFile("files\\xhtml.html")
    
    val addAlt = new RewriteRule {
      override def transform(n: Node): Seq[Node] = n match {
        // I don't find a solution
        case e: Elem if(e.label == "img" && e.attributes("alt") == null) => e % Attribute(None, "alt", Text("TODO"), Null)
    //      	case next @ <img/> if (next.attributes("alt") == null) => next.asInstanceOf[Elem] % Attribute(None, "alt", Text("TODO"), Null)
        case _ => n
      }
    }
    
    
    println(myFile)
    println("#########################")
    println(addAlt(myFile))   
    println("Thats wrong")
    
    println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>")
    val test = <img src="http://www.w3.org/Icons/ohneAlt2" id="ohneAlt2"/>
    println(addAlt(test))
    println("Thats ok")
  }  
  
}