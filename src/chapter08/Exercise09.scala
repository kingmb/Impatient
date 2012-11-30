package chapter08

object Exercise08 {
  
 class Person(val name: String) {
	 override def toString = getClass.getName + "[name=" + name + "]"
 }
 class SecretAgent(codename: String) extends Person(codename) {
	 override val name = "secret" //Don’t want to reveal name . . . 
	 override val toString = "secret" // . . . or class name
 } 
 
 def main(args: Array[String]): Unit = {
	 println(new Person("Franz"))
	 println(new SecretAgent("Geheim"))
 }
}