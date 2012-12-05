package chapter09
import scala.collection.mutable.ArrayBuffer

object Exercise10 {
  
  @SerialVersionUID(42L) class Person (val name:String) extends Serializable {
    private val friends = new ArrayBuffer[Person] // OK—ArrayBufferis serializable
    def addFriend(friend:Person) = friends.append(friend)
    override def toString = name + " Friends: " + friends.mkString(",") 
  }
   
  def main(args: Array[String]): Unit = {
    val fred = new Person("Freddy")
    val tony = new Person("Tony")   
    val tom = new Person("Tom")   
    fred.addFriend(tony)
    tony.addFriend(tom) 
    // No recursion please, than it crash :-) -> tony.addFriend(fred) 
    println(fred)
    import java.io._
    val out = new ObjectOutputStream(new FileOutputStream("files//test.obj"))
    out.writeObject(fred)
    out.close()
    val in = new ObjectInputStream(new FileInputStream("files//test.obj"))
    val savedFred = in.readObject().asInstanceOf[Person]
    println(savedFred)
  }
  
}