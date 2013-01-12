package chapter17


object Exercise08 {
  
  def main(args: Array[String]): Unit = {  
    class Person(val in: Int) {
      override def toString = "Person: " + in
    }
    class Student(in: Int) extends Person(in) {
      override def toString = "Student: " + in
    }
    
    class Pair[+T](val first: T, val second: T) {
      def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
      override def toString = first + " # " + second
    }
    
    class PairMutable[T](var first: T, var second: T) {
     // Error: type mismatch;  found   : newFirst.type (with underlying type R)  required: T  possible cause: missing arguments for method or constructor
     // And PairMutable[+T] is not allowed, because covariant type T occurs in contravariant position in type T of value first_=	and second_=
      // def replaceFirst[R >: T](newFirst: R) = first = newFirst
      override def toString = first + " # " + second
    }
    
    val p1 = new Person(1)
    val p2 = new Person(2)
    val s1 = new Student(1)
    val s2 = new Student(2)
    
    val pp = new Pair(p1, p2) // Thats a pair of Person
    println(pp)
    println(pp.replaceFirst(s1))
    
    val ps = new Pair(p1, s1) // Thats a pair of Person too
    println(ps)
    println(ps.replaceFirst(s2))
    
    val ss = new Pair(s1, s2) // Thats a pair of Student
    println(ss)
    println(ss.replaceFirst(p1)) // And a pair of Students with a Non-Person is not allowed
  }  
  
}