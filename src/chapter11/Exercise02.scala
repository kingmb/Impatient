package chapter11
import java.math.BigInteger;

object Exercise02 {
    
  class MyInt (big: BigInteger) extends BigInt(big) {
  	def ** (exponent: Int): BigInt = {
  			pow(exponent)
  	}	
  }
  
  def main(args: Array[String]): Unit = {  
    println((4:BigInt) pow 3)
    println(new MyInt(new java.math.BigInteger("4", 10)) ** 3) // So, where is the problem ??ß
  }
  
}