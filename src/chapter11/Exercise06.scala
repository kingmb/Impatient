package chapter11

object Exercise06 {
  
  class ASCIIArt(private val str: List[String] ) {
    def print = str.foreach(println(_))
    // vertical
    def ^ (other: ASCIIArt) = {
      print 
      other.print
    }
    private def getElem(i: Int) = if (i < str.length) str(i) else ""
      
    // horizontal
    def > (other: ASCIIArt) = {
      val myMaxLenLine = str.foldLeft(0)((i,m)=> if (i > m.length) i else m.length)
      val maxEntries = Math.max(str.length, other.str.length)
      for (i <- 0 until maxEntries) {
        val nextMyElem = getElem(i)
        val nextOtherElem = other.getElem(i)
        println(nextMyElem + " " * (myMaxLenLine - nextMyElem.length) + nextOtherElem) 
      }

    }
  }

  
  def main(args: Array[String]): Unit = { 
    val first = new ASCIIArt(List(" --", "*      *", "*  *", " --"))
    val second = new ASCIIArt(List("###", "# #", "# #", "###"))
    first ^ second
    println()
    println("###########################")
    println()
    first > second
  }
  
}