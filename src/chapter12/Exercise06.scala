package chapter12

object Exercise06 {
  
  def main(args: Array[String]): Unit = {  

    def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = {
      // calling fun two times, not that good...
      val erg = inputs.foldLeft(Int.MinValue, Int.MinValue)((a: Tuple2[Int,Int], b: Int) => if (a._2 < fun(b)) (b, fun(b)) else a)
      erg._1
    }
    
    println(largestAt(x => 10 * x - x * x, 1 to 10))
  }
}