package chapter10

import java.beans._
object Exercise05 {
  
  trait PropertyChangeSupport { 
    val source: Object 
    
    def addPropertyChangeListener(listener: PropertyChangeListener) { this.synchronized { }
      // Add here we go ...
    	println("its allowed")
    }
  }
  
  def main(args: Array[String]): Unit = {  
    val prop = new java.awt.Point(2,4) with PropertyChangeSupport { 
      override val source = this
    }
    prop.addPropertyChangeListener(null)
    
    
  }
  
}