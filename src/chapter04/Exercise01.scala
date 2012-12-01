package chapter04

object Exercise01 {
  
  def main(args: Array[String]): Unit = {
    var firstPrice = Map("Ich" -> 10, "Du" -> 2, "Meister" -> 5)
    var tenPercent = for ((i,j) <- firstPrice) yield (i, j * 1.1)
    var tenPercent2 = firstPrice.map(i => (i._1, i._2 * 1.1))
    
    println(firstPrice)
    println(tenPercent) 
    println(tenPercent2) 
  } 
}