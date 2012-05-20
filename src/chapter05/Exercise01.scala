package chapter05

object Exercise01 {
  
  class Counter {
    private var value = 0;
    def increment() { 
      if (value < Int.MaxValue) value += 1
    }
    def current = value
  }
  
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    println(myCounter.current)
    for (i <- 0 until Int.MaxValue) {
    	myCounter.increment()     
    }
    println(myCounter.current) // Maximaler Wert
    myCounter.increment()
    println(myCounter.current) // Und hier gehts über die Grenze ins negative
  } 
}