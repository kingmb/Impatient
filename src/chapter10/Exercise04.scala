package chapter10

import java.awt.Point
object Exercise04 {
  
  trait Logger { 
    def log(msg: String)
  }
  
  trait CryptoLogger extends Logger {
    val key = 3
    
    // http://vigtig.it/blog/blog/2011/04/09/learning-scala-in-5-parts-part-3/
    private def caesar(c:Char) = c match {
			case c if c isLower => ('a'+((c-'a'+key)%26)).toChar
			case c if c isUpper => ('A'+((c-'A'+key)%26)).toChar
			case _ => c // _ is a wildcard pattern
    }
    def encrypt(s:String) = s map caesar
    
    override def log(msg: String) = println("Key = " + key + "->" + encrypt(msg))
  }
  
  class DefaultLogger extends CryptoLogger
  class NegativeLogger extends CryptoLogger { override val key = -3}
  
  def main(args: Array[String]): Unit = {  
    val text:String = "Hello 2you or Me!"
    new DefaultLogger log text
    new NegativeLogger log text
  }
  
}