package chapter14


object Exercise08 {
  
  def main(args: Array[String]): Unit = {  
    
    sealed abstract class BinaryTree
    case class Leaf(value: Double) extends BinaryTree
    case class Node(op: Char, children: BinaryTree*) extends BinaryTree
    
    def leafSum(value: BinaryTree): Double = {
      value match {
        case Leaf(x) => x
        case Node(op, x) => min(op, leafSum(x))
        case Node(op, x, tail @ _*) => eval(leafSum(x), op, tail.foldLeft(0.0)(_ + leafSum(_)))
      }
    }
    
    def eval(f: Double, op: Char, s: Double) = 
      op match {
      case '+' => f + s
      case '-' => f - s
      case '*' => f * s
      case '/' if s != 0 => f / s
      case _ => 0
    	}
   
    def min(op: Char, v: Double) = 
      op match {
      case '-' => - v
      case _ => v
    	}
    
    
    println(leafSum(Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))))
  }
}