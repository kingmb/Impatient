 package chapter05

object Exercise03 {
  
  class Time(private var hours: Int, private var minutes: Int) {
    if (hours < 0 || hours > 23) throw new IllegalArgumentException
    else if (minutes < 0 || minutes > 59) throw new IllegalArgumentException
    def before(other: Time): Boolean = { hours < other.hours || (hours == other.hours && minutes < other.minutes) }
  }
  
  def main(args: Array[String]): Unit = {
    val myTime = new Time(7, 43)
    try {
      println(myTime.before(new Time(-2, 12)))
    }
    catch {
      case _ => println("Stunde zu gro�") 
    }
    try {
      println(myTime.before(new Time(2, 62)))
    }
    catch {
      case _ => println("Minute zu gro�") 
    } 
    println(myTime.before(new Time(7, 42)))
    println(myTime.before(new Time(7, 43)))
    println(myTime.before(new Time(12, 23)))
  } 
}