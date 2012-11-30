package chapter06
import java.awt.Point

object Exercise06 {

	object Card extends Enumeration {
	  val kreuz = Value("♣")
	  val karo = Value("♦")
	  val herz = Value("♥")
	  val pik = Value("♠")
	}

  def main(args: Array[String]): Unit = {
    println(Card.kreuz)
    println(Card.karo)
    println(Card.herz)
    println(Card.pik)
  }

}