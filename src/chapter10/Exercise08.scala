package chapter10

import java.io._
object Exercise08 {
  
  trait BufferedInputStream {
    def read() = {
      println("read")
      6
    }
  }
  
  def main(args: Array[String]): Unit = {  
		class MyBuffer(input: InputStream) extends FilterInputStream(input) with BufferedInputStream {
		  override def read = super.read
		}
		val myBuf = new MyBuffer(new FileInputStream("files//test.obj"))
		myBuf.read
		myBuf.close
  }
  
}