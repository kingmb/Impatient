package chapter06
import java.awt.Point

object Exercise03 {


	object Origin extends Point{}	

  def main(args: Array[String]): Unit = {
    val point = Origin
    point.setLocation(3, 4)
    println(point)
    val point2 = Origin
    point2.setLocation(12,443)
    println(point2)
    println(point)
  }

}