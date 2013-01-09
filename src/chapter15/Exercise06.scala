package chapter15

object Exercise06 {
  //@volatile 
  var myBool:Boolean = false 
  
  def main(args: Array[String]): Unit = {  
        val threadSet: Thread = new Thread(){
        override def run() {
          Thread.sleep(2000)
          println("set to true")
          myBool = true 
        }
      }
      val threadRead: Thread = new Thread(){
        override def run() { 
          while(true) {
          	if (myBool == false) {
          		println("false found")
          		Thread.sleep(500)
          	}
          	else {
          	  println("true found")
          	  sys.exit()
          	}
          }
        }
      }
      threadRead.start
      threadSet.start  
  }
}