package chapter06

object Exercise01 {
  object Conversions { // Missing Constants
  	def inchesToCentimeters(i: Double) = i * 1
  	def gallonsToLiters(i: Double) = i * 2
  	def milesToKilometers(i: Double) = i * 3
  }

  def main(args: Array[String]): Unit = {
    println(Conversions.inchesToCentimeters(3.2))
    println(Conversions.gallonsToLiters(3.2))
    println(Conversions.milesToKilometers(3.2))
  }

}