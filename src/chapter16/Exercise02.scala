package chapter16


object Exercise02 {
  
  def main(args: Array[String]): Unit = {  
    val xml = 

  /* --- Error REPL ---------------
      
<ul>
  <li>Opening bracket: [</li>
  <li>Closing bracket: ]</li>
  <li>Opening brace: {</li>
  <li>Closing brace: }</li>
</ul>
      
  <console>:5: error: in XML literal: in XML content, please use '}}' to express '}'
  <li>Closing brace: }</li>
                     ^
<console>:5: error:  I encountered a '}' where I didn't expect one, maybe this tag isn't closed <li>
  <li>Closing brace: }</li>
   ^
<console>:6: error: in XML literal:  expected end of Scala block
</ul>
  */
  
  <ul>
  <li>Opening bracket: [</li>
  <li>Closing bracket: ]</li>
  <li>Opening brace: {{</li>
  <li>Closing brace: }}</li>
</ul>
  
  println(xml)
  }  
  
}