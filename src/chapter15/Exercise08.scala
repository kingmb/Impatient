package chapter15

object Exercise08 {
  
  def allDifferent[@specialized T](x: T, y: T, z: T) = x != y && x != z && y != z

  
  def main(args: Array[String]): Unit = {  
    println(allDifferent(3, 4, 5))
  }
}

/*
 * Compiled from "Exercise08.scala" with java-compiler
public final class chapter15.Exercise08 extends java.lang.Object{
    public static void main(java.lang.String[]);
    public static boolean allDifferent(java.lang.Object, java.lang.Object, java.
lang.Object);
}

 */