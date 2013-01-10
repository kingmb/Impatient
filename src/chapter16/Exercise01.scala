package chapter16


object Exercise01 {
  
  def main(args: Array[String]): Unit = {  
    val xml1 = <fred/>(0)
    val xml2 = <fred/>(0)(0)
    
    println(xml1) // scala.xml.Node = <fred></fred>
    println(xml2) // scala.xml.Node = <fred></fred>
  }  
  
}