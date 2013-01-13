package chapter18


object Exercise02 {
  
  def main(args: Array[String]): Unit = {  
    object and
    object show
    object then
    object around
    
    class Bug {
      private var useNextArgAs: Any = null
      private var pos = 0
      private var add = true
      def move(i: Int) = {
        if (add) pos = pos + i else pos = pos - i
        this
      }
      private def internTurn () = {
        add = !add
        this
      }
      private def showi() = {
        print(" " + pos + " ")
        this
      }
      def and(obj: show.type): this.type = {
        showi
        this
      }
      def and(obj: then.type): this.type = {
        this
      }
      def turn(obj: around.type): this.type = {
        this
      }
    } 
    
    val bugsy = new Bug
    //bugsy move 4 and show and then move 6 and show turn around move 5 and show
    bugsy move 4 and show and then move 6 and show turn around move 5 and show

  }  
  
}