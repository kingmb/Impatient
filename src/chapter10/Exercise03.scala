package chapter10

object Exercise03 {

  /*
   * Superclass: scala.collection.AbstractSet 
   * Traits: SortedSet -> Set -> ...
             scala.collection.BitSet -> BitSetLike ...
             BitSetLike[BitSet]
             Serializable
   *                      
   * 1) AbstractSet (Superclass)
   * 2) Set and other (from Superclass)
   * 3) SortedSet (from BitSet-Class)
   * 4) BitSetLike (from BitSet-Trait) 
   * 5) Serializable (from BitSet-Class)
   * 6) BitSet-Class      
   *   
   */
  
  def main(args: Array[String]): Unit = {  
    val bits = scala.collection.immutable.BitSet.empty
    println(bits)
  }  
  
  
}