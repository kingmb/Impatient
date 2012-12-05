package chapter10
import java.io._

object Exercise10 {
  class IterableInputStream(val in: InputStream) extends InputStream with Iterable[Byte] {
    override def read(): Int = in.read
    override def iterator = new Iterator[Byte] {
      var nextValue: Int = 0
      def hasNext: Boolean = { 
        nextValue = in.read()
        return nextValue > -1
      }
      def next(): Byte = if (nextValue > -1) nextValue.toByte else throw new NoSuchElementException("next on empty iterator")
    }
      
  }
  
  def main(args: Array[String]): Unit = {  
		val myStream = new IterableInputStream(new FileInputStream("files//test.obj"))
		println("Hans")
		for (byte <- myStream.iterator) { println("" + byte) }
		println("Wurst")
		myStream.close
  }  
}