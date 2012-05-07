package chapter02

object Exercise04 {

  def main(args: Array[String]): Unit = {
    for (i <- (1 to 10).reverse) {
      println(i); 
    }
    for (i <- 10 to 1 by -1) {
      println(i); 
    }    
  }

}