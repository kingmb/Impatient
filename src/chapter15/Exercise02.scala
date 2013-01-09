package chapter15


object Exercise02 {
  @deprecated class MyDep[@deprecated T](@deprecated val info: Int) {
    @deprecated def myMethode(@deprecated depVar: Int): Int = {
      @deprecated val erg = 12
      erg
    }
  }
  
  def main(args: Array[String]): Unit = {  
    val myDepClass = new MyDep(3)
    println(myDepClass.myMethode(8))
    
  }
}