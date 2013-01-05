package chapter13

object Exercise09 {
  
  def main(args: Array[String]): Unit = {  

   def readFrequencyFalse(in: String) = {
     val frequencies = new scala.collection.mutable.HashMap[Char, Int]
     for (c <- in.par) frequencies(c) = frequencies.getOrElse(c, 0) + 1
     frequencies
   }
   def readFrequency(in: String) = {
       in.par.aggregate(Map[Char, Int]())((m: Map[Char, Int],c: Char) => m + (c -> 1)
         , (map1, map2) => map1 ++ map2.map{ case (k,v) => k -> (v + map1.getOrElse(k,0)) })   
   }
   
   val str: String = "Hallo Sie da im Radio"
   val erg = readFrequencyFalse(str)
   println(erg)
   val erg2 = readFrequency(str)
   println(erg2)
  }
}