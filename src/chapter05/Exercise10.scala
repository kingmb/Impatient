 package chapter05

object Exercise10 {
  
	class EmployeeWorse(val name: String, var salary: Double) {
		def this() { this("John Q. Public", 0.0) }
		override def toString =  name + salary
	}
	
	class EmployeeBetter(val name: String = "John Q. Public", var salary: Double = 0.0) {
    override def toString =  name + salary
	}
	
  def main(args: Array[String]): Unit = { 
    println(new EmployeeWorse("hi", 2.5))
    println(new EmployeeBetter("hi", 2.5))
    println(new EmployeeWorse())  
    println(new EmployeeBetter("hu"))
    println(new EmployeeBetter(salary = 4, name = "hewrl"))
  } 	
}