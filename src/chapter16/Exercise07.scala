package chapter16

import xml._

object Exercise07 {
  
  def main(args: Array[String]): Unit = {  
    
    def transform(in: Map[String, String]): Elem = {
      <dl>{for (i <- in) yield <dt>{i._1}</dt><dd>{i._2}</dd>}</dl>
    }
    
    println(transform(Map("A" -> "1", "B" -> "2")))
  }  
  
}