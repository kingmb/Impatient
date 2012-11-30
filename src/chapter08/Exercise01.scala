package chapter08

object Exercise01 {
  
 class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
    override def toString() = "" + balance
  }
 
 	class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
 	  override def deposit(amount: Double) = { super.deposit(amount - 1) }
    override def withdraw(amount: Double) = { super.withdraw(amount + 1)}
 	}
  def main(args: Array[String]): Unit = {
    val ba = new BankAccount(100)
  	val ca = new CheckingAccount(100)
    
    ba.deposit(10)
    ca.deposit(10)
    println(ba)
    println(ca)
    ba.withdraw(20)
    ca.withdraw(20)
    println(ba)
    println(ca)
    
  } 
}