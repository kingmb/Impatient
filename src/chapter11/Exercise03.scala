package chapter11

object Exercise03 {
  
  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n,d);
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n,d);
    override def toString = num + "/" + den
    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a%b)
    def abs(a: Int) = if (a > 0) a else a * (-1)
    def * (other: Fraction) = new Fraction(num * other.num, den * other.den)
    def / (other: Fraction) = new Fraction(num * other.den, den * other.num)
    def + (other: Fraction) = new Fraction(num * other.den + other.num * den, den * other.den)
    def - (other: Fraction) = new Fraction(num * other.den - other.num * den, den * other.den)
  }
  
  def main(args: Array[String]): Unit = {  
    println(new Fraction(15, -6))
    println(new Fraction(15, 0))
    val first = new Fraction(4,3)
    val second = new Fraction(2,1)
    println(first * second)
    println(first / second)
    println(first + second)
    println(first - second)
  }
  
}