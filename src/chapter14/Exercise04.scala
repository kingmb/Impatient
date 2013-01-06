package chapter14


object Exercise04 {
  
  def main(args: Array[String]): Unit = {  
    
    abstract class Item
    case class Article(description: String, price: Double) extends Item
    case class Bundle(description: String, discount: Double, items: Item*) extends Item
    case class Multiple(multi: Int, item: Item) extends Item
    
    def price(it: Item): Double = it match {
      case Article(_, p) => p
      case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
      case Multiple(m, it) => price(it) * m 
    } 
    
    println (price(Multiple(10, Article("Blackwell Toaster", 29.95))))
  }
}