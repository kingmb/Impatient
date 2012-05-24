package chapter05

object Exercise08 {
  
  class Car(val manufacturer:String
    , val name:String
    , val year:Int
    , var licensePlate:String) {
    
    def this(m:String, n:String) {
      this(m, n, -1, "")
  	}
    def this(m:String, n:String, y: Int) {
      this(m, n, y, "")
  	}
    def this(m:String, n:String, l: String) {
      this(m, n, -1, l)
  	}
    override def toString():String =  manufacturer + name + year + licensePlate
  }
  
  def main(args: Array[String]): Unit = { 
    println(new Car("hl", "DDF"))
  } 
}