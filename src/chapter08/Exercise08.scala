package chapter08

object Exercise09 {
  class Creature {
  	def range: Int = 10
  	val env: Array[Int] = new Array[Int](range)
  	override def toString = "Length: " + env.length
  }
  class Ant extends Creature {
  	override def range = 2
  }
  
  def main(args: Array[String]): Unit = {
    println(new Creature)
    println(new Ant)
  }  
}