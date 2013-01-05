package chapter13

object Exercise08 {
  
  def main(args: Array[String]): Unit = {  

   def convert(d: Array[Double], col: Int):Array[Array[Double]] = {
     d.grouped(col).toArray
   } 
   
   val erg = convert(Array(1,2,3,4,5,6), 3)
   println( scala.runtime.ScalaRunTime.stringOf(erg))
  }
}