 package chapter05

object Exercise06 {
  
  class Person(private var age: Int) {
    age = if (age < 0) 0 else age
    override def toString():String = age.toString()
  }
  class Person2(myAge: Int) {
    private val age = if (myAge < 0) 0 else myAge
    override def toString():String = age.toString()
  }
  
  
  def main(args: Array[String]): Unit = {
    println(new Person(4711))  
    println(new Person(0))  
    println(new Person(-23))  
    println(new Person2(-23))  
    
  } 
}