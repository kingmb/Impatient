package chapter12

object Exercise10 {
  
  def main(args: Array[String]): Unit = {  
    
    def unless(condition: => Boolean)(block: => Unit) {
      if (!condition) block
    }
    
    def unlessWithCallByValue(condition: () => Boolean)(block: => Unit) {
      if (!condition()) block
    }
    
     def unlessWithoutCurrying(condition: => Boolean, block: => Unit) {
      if (!condition) block
    }   
    
    val x = 10
    if (x == 10) { println("if is true") }
    unless (x == 10) {println("unless 10 is true") }
    unless (x == 333) {println("unless not 10 is true") }
    unlessWithCallByValue(() => x == 10) {println("unless 10 is true By Value") }
    unlessWithCallByValue(() => x == 333) {println("unless not 10 is true By Value") }
    unlessWithoutCurrying(x == 10, {println("unless 10 is true Without Curry") })
    unlessWithoutCurrying(x == 333, {println("unless not 10 is true Without Curry")})
  }
}