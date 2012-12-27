package chapter11

object Exercise07 {
  
  class BitSequence (var seq: Long){
    def print = println(seq.toBinaryString)
    
    def apply(idx: Int): Char = {
      seq.toBinaryString(idx)
    }
    
    def update(idx: Int, set: Boolean) = {
      val newVal = if (set) '1' else '0'
      val newString: StringBuilder = new StringBuilder(seq.toBinaryString).replace(idx, idx+1, newVal.toString)
      seq = java.lang.Long.parseLong(newString.toString, 2);
      print
    }    
  }

  
  def main(args: Array[String]): Unit = { 
    val bs = new BitSequence(1343)
    // 10100111111
    bs.print
    println('1' == bs(2))
    println('0' == bs(3))
    bs(2) = false
    println('0' == bs(2))
    println('0' == bs(3))
    bs(2) = true
    println('1' == bs(2))
    println('0' == bs(3))
    
  }
  
}