 package chapter07

object Exercise03 {
  
 def main(args: Array[String]): Unit = {  
  import random._
  println(random.nextInt)
  println(random.nextDouble)
  random.setSeed(34)
  println(random.nextInt)
  println(random.nextDouble)
 }
}

