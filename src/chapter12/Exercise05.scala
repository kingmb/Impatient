package chapter12

object Exercise05 {
  
  def main(args: Array[String]): Unit = {  

    def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
      inputs.reduceLeft((a, b) => a max fun(b))
    }
    
    println(largest(x => 10 * x - x * x, 1 to 10))
  }
}