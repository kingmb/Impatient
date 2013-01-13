package chapter18


object Exercise03 {
  
  def main(args: Array[String]): Unit = {     
    object Title 
    object Author
    
    class Document {
      var title: String = ""
      var author: String = ""
      private var useNextArgAs: Any = null
      
      def set(obj: Title.type): this.type = {useNextArgAs = obj; this}
      def set(obj: Author.type): this.type = {useNextArgAs = obj; this}
      def to(arg: String) = {
        if (useNextArgAs == Title) title = arg else if (useNextArgAs == Author) author = arg
        this
      }
      def show() = println(title + " from " + author)
    }
    
    
    val book1 = new Document
    book1 set Title to "Scala for the Impatient" 
    
    val book = new Document
    book set Title to "Scala for the Impatient" set Author to "Cay Horstmann" show

  }  
  
}