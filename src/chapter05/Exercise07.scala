package chapter05

object Exercise07 {
  
  class Person(name: String) {
    val reg = name.splitAt(name.indexOf(" "))
    val firstName = if (reg._1.isEmpty()) reg._2 else reg._1
    val lastName = if (reg._1.isEmpty()) reg._1 else reg._2.trim
    override def toString():String = "/" + firstName + "/" + lastName + "/"
  }
  
  
  def main(args: Array[String]): Unit = {
    println(new Person("Hein Meier"))  
    println(new Person("Heinie"))      
  } 
}