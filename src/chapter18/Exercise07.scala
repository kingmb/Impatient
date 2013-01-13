package chapter18

object Exercise07 {
 
 def main(args: Array[String]): Unit = {     
  		def doClose(in: {def close(): Unit}) = {
  		  in.close
  		}
  		
  		class Test1 {
  		  def close(): Unit = println("Closed by Test1")
  		}
  		
  		class Test2 {
  		  def close(): Unit = println("Closed by Test2")
  		}
  		
  		doClose(new Test1)
  		doClose(new Test2)  	   	
  }  
}