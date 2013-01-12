package chapter17


object Exercise03 {
  
  def main(args: Array[String]): Unit = {  
    class Pair[T, S] (val first: T, val second: S) {
      override def toString() = first + " " + second
    }
    
    def swap[T, S](in: Pair[T, S]): Pair[S, T] = {
      new Pair(in.second, in.first) 
    }
    
    val pairInt = new Pair(3,5)
    val pairIntString = new Pair(4, "Hallo")
    val pairDoublePair = new Pair(3.5, new Pair(2, 3.2))
    
    println(swap(pairInt))
    println(pairInt)

    println(swap(pairIntString))
    println(pairIntString)
    
    println(swap(pairDoublePair))
    println(pairDoublePair)
  }  
  
}