package chapter18

import scala.collection.mutable.ArrayBuffer

object Exercise04 {
  
  def main(args: Array[String]): Unit = {     
    
    class Network {
      class Member(val name: String) {
        val contacts = new ArrayBuffer[Member]
        override def equals(other: Any): Boolean = {
          other match {
            case that: Member => {
                   that.isInstanceOf[Member] &&
                   that.contacts.equals(contacts) // they have no contacts, so that part is always true
            }
            case _ => false
          } 
        }
      }
      
      private val members = new ArrayBuffer[Member]
      
      def join(name: String) = {
        val m = new Member(name)
        members += m
        m
      }
    }

    val chatter = new Network
    val myFace = new Network
    
    val fred = chatter.join("Fred")
    val barney = myFace.join("Barney")
  //  fred.contacts += barney
    
    println(fred)
    println(barney)
    println(fred.equals(fred)) // Expect true
    println(fred.equals(barney)) // Expect false, other network
    
  }  
  
}