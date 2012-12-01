 package chapter06

object Exercise02 {

  abstract class UnitConversion { // Missing Constants
  	def convert(i: Double) = i * factor
  	def factor :Double
  }
	object InchesToCentimeters extends UnitConversion{
	  def factor = 1
	}
	object GallonsToLiters extends UnitConversion{
	  def factor = 2
	}
	object MilesToKilometers extends UnitConversion{
	  def factor = 3
	}	

  def main(args: Array[String]): Unit = {
    println(InchesToCentimeters.convert(3.2))
    println(GallonsToLiters.convert(3.2))
    println(MilesToKilometers.convert(3.2))
  }

}