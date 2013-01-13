package chapter18

import scala.collection.mutable.ArrayBuffer

object Exercise05 {
  
  def main(args: Array[String]): Unit = {     
    
    class Network {
      class Member(val name: String) {
        val contacts = new ArrayBuffer[Member]
        override def equals(other: Any): Boolean = {
          other match {
            case that: Member => {
                   that.isInstanceOf[Member] &&
                   that.contacts.equals(contacts) 
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
    
    type NetworkMember = n.Member forSome { val n: Network }
    
    def process(m1: NetworkMember, m2: NetworkMember) = (m1, m2)
    
    def processOrg[M <: n.Member forSome {val n: Network}](m1: M, m2: M) = (m1, m2)
    
    val chatter = new Network
    val myFace = new Network
    
    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    val barney = myFace.join("Barney")

    process(fred, wilma)
    process(fred, barney)
    
    processOrg(fred, wilma)
 //    processOrg(fred, barney)
    // inferred type arguments [Network#Member] do not conform to method processOrg's type parameter bounds [M <: n.Member( forSome { val n: Network })]

    
  }  
  
}