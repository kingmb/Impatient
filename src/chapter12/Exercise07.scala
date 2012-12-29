package chapter12

object Exercise07 {
  
  def main(args: Array[String]): Unit = {  

    val pairs = (1 to 10) zip (11 to 20)
    pairs foreach (println(_))
    // Not allowed pairs.map(_ + _)
    
    def adjustToPair(funWithTwoSepValues: (Int, Int) => Int) = (pair: Tuple2[Int, Int]) => funWithTwoSepValues(pair._1, pair._2)
    
    println(adjustToPair(_ * _)((6,7)))
    
    println(pairs.map(adjustToPair(_ * _)).sum)
  }
}