package chapter05

object Exercise10 {
  
	class Employee1(val name: String, var salary: Double) {
		def this() { this("John Q. Public", 0.0) }
	}
	
	class Employee() {
	  var name: String = "John Q. Public"
	  var salary: Double = 0.0
		def this(n: String, s: Double) = {
	    this()
	    name = n
	    salary = s
	  }
	}
}