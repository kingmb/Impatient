package chapter14


object Exercise07 {
  
  def main(args: Array[String]): Unit = {  
    
    sealed abstract class BinaryTree
    case class Leaf(value: Int) extends BinaryTree
    case class Node(children: BinaryTree*) extends BinaryTree
    
    def leafSum(value: BinaryTree): Int = {
      value match {
        case Leaf(x) => x
        case Node(x, tail @ _*) => leafSum(x) + tail.foldLeft(0)(_ + leafSum(_))
      }
    }
    
    println(leafSum(Node(Leaf(3), Node(Leaf(4), Node(Leaf(4), Leaf(10))))))
    println(leafSum(Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))))
  }
}