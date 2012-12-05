package chapter10

object Exercise07 {
  
  trait Root { 
    def print
  }
  
  trait Logger { 
    def log = println("Hans Wurst")
  }
  
  
  trait Node extends Root {
    val width = 5
    val height: Int
    def print = println(width + " + " + height)
  }
  
  trait Person extends Node with Logger {}
  
  class LongPerson extends Person {
    val height = 100
  }
  
  class SmallPerson extends Person {
    val height = 20
  }
  
  def main(args: Array[String]): Unit = {  
		val smallPerson = new SmallPerson
		val longPerson = new LongPerson { override val width = 33; override val height = 200 }
		val longPerson2 = new LongPerson

		smallPerson.print
		smallPerson.log
		longPerson.print
		longPerson2.print
  }
  
}