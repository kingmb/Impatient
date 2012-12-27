package chapter11

object Exercise08 {
  
  class Matrix (val a: Vector[Int]){
    assert(a.length == 4)
    
    def print = {
      println("####################")
      println(a.take(2).mkString(" "))
      println(a.drop(2).mkString(" "))
    }
    
    def + (that: Matrix): Matrix = new Matrix(Vector(
          a(0) + that.a(0)
        , a(1) + that.a(1)
        , a(2) + that.a(2)
        , a(3) + that.a(3)))
    
    def * (that: Matrix): Matrix = new Matrix(Vector(
          a(0) * that.a(0) + a(1) * that.a(2)
        , a(0) * that.a(1) + a(1) * that.a(3)
        , a(2) * that.a(0) + a(3) * that.a(2)
        , a(2) * that.a(1) + a(3) * that.a(3)))
    
    def * (mul: Int): Matrix = new Matrix(a.map(_ * mul))
  }

  def main(args: Array[String]): Unit = { 
    val bs = new Matrix(Vector(2,-3,10,20))
    val other = new Matrix(Vector(1, 2, 1, 2))
    bs.print
    other.print
    (bs * other).print
    (bs + other).print
    (bs * 10) print
  }
  
}