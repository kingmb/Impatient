package chapter05

object Exercise02 {
  
  class BankAccount {
    private var balance = 0.0;
    def deposit(sum: Double ) = balance += sum
    def withdraw(sum: Double) = balance -= sum
    def currentBalance = balance
  }
  
  def main(args: Array[String]): Unit = {
    val myAccount = new BankAccount
    myAccount.deposit(3)
    myAccount.withdraw(4)
    println(myAccount.currentBalance)
  } 
}