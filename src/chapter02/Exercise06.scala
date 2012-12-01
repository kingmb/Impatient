 package chapter02

object Exercise06 {

  def main(args: Array[String]): Unit = {
    println(sumUnicode("Hello") == 825152896)
  }
  
  def sumUnicode(s: String): Long = {
    var prod = 1;
    for (i <- (0 until s.length)) {
      printf("Wert %s: %s\n", s(i), s(i).toInt)
      prod *= s(i).toInt
      println(s(i).toInt)
      println(prod)
    }
    prod   
  }

}