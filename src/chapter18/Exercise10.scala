package chapter18

import java.lang.Math._

object Exercise10 {
  
  def main(args: Array[String]): Unit = {     
    
    // I don't know what to do and don't want to spend more time on it.
    // So no solution
    
    
    class ST {
      def log() = println("print ST") 
    }
    
    trait LogWithExtend extends ST {
      override def log() = println("log LogWithExtend")
    }
    
    trait LogWithST {
      this: ST =>
      def log() = println("log LogWithST")
    }
    
    class Test extends ST with LogWithST{
      override def log() = println("log Test")
    }
    
    new Test().log
    
    
  }  
  
}