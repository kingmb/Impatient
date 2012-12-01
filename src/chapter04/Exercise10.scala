package chapter04

object Exercise10 {
  
  def main(args: Array[String]): Unit = {
    println("HelloYou" zip ("Yes"))
    println("Hel".zip("YesItIsntIt"))
    println("Hello" zip ("World"))
  }
}