package chapter12

object Exercise01 {
  
  def main(args: Array[String]): Unit = {  

    def values(fun: (Int) => Int, low: Int, high: Int) = {
      for (i <- low to high) yield (i, fun(i))
    }
    
    val erg = values(x => x * x, -5, 5)
    erg.foreach(println(_))
  }
}