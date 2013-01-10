package chapter16

import xml._

object Exercise08 {
  
  def main(args: Array[String]): Unit = {  
    
    def transform(dl: Elem): Map[String, String] = {
      val allDT = dl \\ "dt"
      val allDD = dl \\ "dd"
      (allDT.map(_.text) zip allDD.map(_.text)).toMap
    }
    
    println(transform(<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>))
  }  
  
}