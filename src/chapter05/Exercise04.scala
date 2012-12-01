package chapter05

object Exercise04 {
  
  class Time(hours: Int, minutes: Int) {
    if (hours < 0 || hours > 23) throw new IllegalArgumentException
    else if (minutes < 0 || minutes > 59) throw new IllegalArgumentException
    private val minutesSinceMidnight = hours * 60 + minutes
    def before(other: Time): Boolean = { minutesSinceMidnight < other.minutesSinceMidnight }
  }
  
  def main(args: Array[String]): Unit = {
    val myTime = new Time(7, 43)
    try {
      println(myTime.before(new Time(-2, 12)))
    }
    catch {
      case _ => println("Stunde zu groﬂ") 
    }
    try {
      println(myTime.before(new Time(2, 62)))
    }
    catch {
      case _ => println("Minute zu groﬂ") 
    } 
    println(myTime.before(new Time(7, 42)))
    println(myTime.before(new Time(7, 43)))
    println(myTime.before(new Time(12, 23)))
  } 
}