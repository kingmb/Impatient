package chapter10

object Exercise06 {
  
  trait Component { 
    def print = println("Component")
  }
  
  trait Container extends Component {
    override def print = println("Container" + super.print)
  }
  
  trait JComponent extends Component {
    override def print = println("JComponent" + super.print)
  }  
  
  trait JContainer extends Container with JComponent {
    override def print = println("JContainer" + super.print)
  }
  
  class JButton extends JComponent {
     override def print = println("JButton" + super.print)   
  }
  
  class JPanel extends JContainer {
     override def print = println("JPanel" + super.print)   
  }  
  
  
  def main(args: Array[String]): Unit = {  
    // In Java a JPanel cannot inherit from Component and Container
    // Now Scala
    val button = new JButton
    val panel = new JPanel
    button.print
    println("###################")
    panel.print
      
  }
  
}