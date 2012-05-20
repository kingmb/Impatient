package chapter05
import scala.reflect.BeanProperty

object Exercise05 {
  
  class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
    override def toString():String = name + " / " + id 
  }
  
  def main(args: Array[String]): Unit = {
    val myStudent = new Student("Heiner", 4711)  
    println(myStudent)
    myStudent.setName("HeinDoof")
    println(myStudent)
    myStudent.setId(22)
    println(myStudent)
    println(myStudent.getName())
    println(myStudent.getId())
    myStudent.name = "Vergessen"
    myStudent.id = 34
    println(myStudent.name)
    println(myStudent.id)
  } 
}