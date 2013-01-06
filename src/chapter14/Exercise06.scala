package chapter14


object Exercise06 {
  
  def main(args: Array[String]): Unit = {  
    
    sealed abstract class BinaryTree
    case class Leaf(value: Int) extends BinaryTree
    case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
    
    def leafSum(value: BinaryTree): Int = {
      value match {
        case Leaf(x) => x
        case Node(l,r) => leafSum(l) + leafSum(r)
      }
    }
    
    println(leafSum(Node(Leaf(3), Node(Leaf(4), Node(Leaf(4), Leaf(10))))))
  }
}