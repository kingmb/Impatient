package chapter10
import java.io._

object Exercise09 {
  trait Logger {
    def log (msg: String)
  }
  
  trait TimestampLogger extends Logger {
    override def log (msg: String) {
      println(new java.util.Date() + " " + msg)
    }
  }
  
  trait BufferedInputStream {
    def read() = {
      println("read")
      6
    }
  }  
  
  def main(args: Array[String]): Unit = {  
		class MyBuffer(input: InputStream) extends FilterInputStream(input) with BufferedInputStream with TimestampLogger {
		  override def read = super.read
		}
		val myBuf = new MyBuffer(new FileInputStream("files//test.obj"))
		myBuf.read
		myBuf.log("Hans Wurst")
		myBuf.close
  }  
}