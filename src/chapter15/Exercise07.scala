package chapter15

import scala.annotation.tailrec

object Exercise07 {
  class Level1 {
    @tailrec final def sumTR(xs: Seq[Int], partial: BigInt): BigInt = {
    	if (xs.isEmpty) partial else sumTR(xs.tail, xs.head + partial)
    }
  }

  
  def main(args: Array[String]): Unit = {  
    val level1 = new Level1()
    println(level1.sumTR(1 to 100000, 0))
  }
}