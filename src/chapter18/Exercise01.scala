package chapter18


object Exercise01 {
  
  def main(args: Array[String]): Unit = {  
    class Bug {
      private var pos = 0
      private var add = true
      def move(i: Int) = {
        if (add) pos = pos + i else pos = pos - i
        this
      }
      def turn() = {
        add = !add
        this
      }
      def show() = {
        print(" " + pos + " ")
        this
      }
    } 
    
    val bugsy = new Bug
    bugsy.move(4).show().move(6).show().turn().move(5).show()
  }  
  
}