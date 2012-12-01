package chapter07
import java.lang.System.{getProperty}
object Exercise09 {
  
 def main(args: Array[String]): Unit = {  
  val userName = getProperty("user.name")
  val pw = readLine
  if ("secret".equals(pw)){ print("Wrong password")}
  else print("Its ok")
 }
}

