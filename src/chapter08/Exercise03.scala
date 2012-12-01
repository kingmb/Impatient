 package chapter08

object Exercise03 {
  
 class Animal(name: String) {
    override def toString() = "" + name
  }
 
 	class Bird(nameOfBird: String) extends Animal(nameOfBird) {
 		def dove = "Hallo Bird"
 	}
 	
 	class Dove(nameOfDove: String) extends Bird(nameOfDove) {
 	  override def dove = "Hallo Dove"
 	  def onlyDoveMethode = "Only here"
 	}
 	
  def main(args: Array[String]): Unit = {
    val tier = new Animal("Tier")
    val taube = new Dove("Taube")
    println(tier)
    println(taube)
    println(taube.isInstanceOf[Animal])
    println(taube.isInstanceOf[Bird])
    println(taube.asInstanceOf[Bird].dove) // Allowed and calls the Dove-Overload
   // println(taube.asInstanceOf[Bird].onlyDoveMethode)  Not allowed
    println(taube.asInstanceOf[Dove].onlyDoveMethode)

    


  } 
}