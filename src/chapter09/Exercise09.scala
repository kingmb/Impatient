package chapter09
object Exercise09 {
  
  import java.io.File
  def subdirs(dir: File): Iterator[File] = {
  		val children = dir.listFiles.filter(_.isDirectory)
  		children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
  
  def main(args: Array[String]): Unit = {
  		val all = subdirs(new File("files")) ++ List(new File("files")) // Subdirectorys and me
  		val total = all.foldLeft(0)((count: Int,file: File) => count + file.listFiles.toList.filter(_.getName().endsWith(".class")).size)
  		println("Count = " + total)
  }
  
}