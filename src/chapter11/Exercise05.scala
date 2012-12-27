package chapter11

object Exercise05 {
  
  class Table {
    print("<table><tr>")
    def | (in: String): Table = {
      print("<td>" + in + "</td>")
      this
    }
    def || (in: String): Table = {
      print("</tr><tr><td>in</td>")
      this
    }
    
    def end() = print("</tr></table>")
  }
  object Table {
    def apply() = new Table
  }
  
  def main(args: Array[String]): Unit = { 
    Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET" end
  }
  
}