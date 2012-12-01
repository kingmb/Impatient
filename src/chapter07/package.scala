 package object random {
  var previous: Double = 10
  def nextInt(): Int = {
    nextDouble.toInt
  }
  def nextDouble(): Double = {
    previous = previous * 1664525 + 1013904223 % Math.pow(2,32)
    previous
  } 
  
  def setSeed(seed: Int): Unit = {
    previous = seed
  }

}
