package chapter11

object Exercise04 {
  
  class Money(d: Int, c: Int) {
    private val dollars: Int = d + c/100
    private val cents: Int = c % 100
    override def toString = dollars + "," + cents
    def + (that: Money) = new Money(dollars + that.dollars, cents + that.cents)
    def - (that: Money) = new Money(dollars - that.dollars, cents - that.cents)
    def == (that: Money) = dollars == that.dollars && cents == that.cents
    def < (that: Money) = dollars < that.dollars || (dollars == that.dollars && cents < that.cents)
    def * (d: Int) = new Money(dollars * d, cents * d)
    def / (d: Int) = ??? // method / make sense, but i'm to lazy to implement it correct
  }
  object Money {
    def apply(d: Int, c: Int) = new Money(d,c)
  }
  
  def main(args: Array[String]): Unit = { 
    val erg = Money(1,75) + Money(0,50)
    println(erg)
    println(erg == Money(2, 25))
    println(erg * 10)
   // println(erg / 10)
  }
  
}