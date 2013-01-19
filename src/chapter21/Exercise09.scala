package chapter21

import java.awt.Point
object Exercise09 {
  
 def main(args: Array[String]): Unit = {  
   /**
    *   sealed abstract class =:=[From, To] extends (From => To) with Serializable
  private[this] final val singleton_=:= = new =:=[Any,Any] { def apply(x: Any): Any = x }
  object =:= {
     implicit def tpEquals[A]: A =:= A = singleton_=:=.asInstanceOf[A =:= A]
  }
    */
   
   // I hate this cryptic operator-overloading-style
   
    /*  1)  sealed abstract class =:=[From, To] extends (From => To) with Serializable
    *   
    *   -> A class of name =:= 
    *   
    *   2) private[this] final val singleton_=:= = new =:=[Any,Any] { def apply(x: Any): Any = x }
    *   
    *   -> A function singleton_=:= which create a new object of Class =:= which returns the input x
    *   
       3) object =:= {  implicit def tpEquals[A]: A =:= A = singleton_=:=.asInstanceOf[A =:= A] }
     
       -> The implicit conversion from ????
  }
    */
 }
}