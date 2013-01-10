package chapter16

import xml._

object Exercise03 {
  
  def main(args: Array[String]): Unit = {  
    val xml  = <li>Fred</li> match { case <li>{Text(t)}</li> => t } 
    val xml2 = <li>{"Fred"}</li> match { case <li>{Text(t)}</li> => t } 
    println(xml)
    println(xml2)
    
  }  
  
}