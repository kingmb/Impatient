package chapter17


object Exercise01 {
  
  def main(args: Array[String]): Unit = {  
    class Pair[T, S] (val first: T, val second: S) {
      def swap(): Pair[S, T] = new Pair(second, first)
      override def toString() = first + " " + second
    }
    
    val pairInt = new Pair(3,5)
    val pairIntString = new Pair(4, "Hallo")
    val pairDoublePair = new Pair(3.5, new Pair(2, 3.2))
    
    println(pairInt.swap)
    println(pairInt)

    println(pairIntString.swap)
    println(pairIntString)
    
    println(pairDoublePair.swap)
    println(pairDoublePair)
  }  
  
}