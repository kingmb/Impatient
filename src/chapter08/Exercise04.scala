package chapter08

object Exercise04 {
  
 abstract class Item {
    def price: Double
    def description: String
    override def toString = description + ":" + price
  }
 
 	class SimpleItem(val price: Double, val description :String) extends Item {}
 	
 	class Bundle extends Item {
 	  private[this] var allItems = List[Item]() // how is it done with a val?
 	  def addItem(newItem: Item) = allItems = newItem :: allItems
 	  def price: Double = allItems.foldLeft(0.0)((b :Double,a: Item) => b + a.price)
 	  def description = allItems.mkString(" + ")
 	}
 	
  def main(args: Array[String]): Unit = {
    val bundle = new Bundle
    bundle.addItem(new SimpleItem(23, "Item1"))
    bundle.addItem(new SimpleItem(55, "Item2"))
    bundle.addItem(new SimpleItem(7, "Item3"))
    println(bundle.price)
    println(bundle.description)
  } 
}