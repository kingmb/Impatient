 package chapter06
import java.awt.Point

object Exercise07 {
  
	object Card extends Enumeration {
	  val kreuz = Value("?")
	  val karo = Value("?")
	  val herz = Value("?")
	  val pik = Value("?")
	  
	}
  def isRed(other: Card.Value) = other == Card.karo || other == Card.herz


  def main(args: Array[String]): Unit = {
    println(isRed(Card.kreuz))
    println(isRed(Card.karo))
    println(isRed(Card.herz))
    println(isRed(Card.pik))
  }
}