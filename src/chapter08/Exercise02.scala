 package chapter08

object Exercise02 {

	import chapter08.Exercise01._
 	class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
 	  var freeTransactions = 3
 	  def earnMonthlyInterest = freeTransactions = 3
 	  override def deposit(amount: Double) = { 
 	    if (freeTransactions > 0) { 
 	      freeTransactions -= 1
 	      super.deposit(amount)
 	    }
 	    else {
 	    	super.deposit(amount - 1)  	      
 	    }
 	  }
    override def withdraw(amount: Double) = { 
 	    if (freeTransactions > 0) { 
 	      freeTransactions -= 1
 	      super.withdraw(amount)
 	    }
 	    else {
 	    	super.withdraw(amount + 1)  	      
 	    }
    }
 	}
  def main(args: Array[String]): Unit = {
  	val sa = new SavingsAccount(100)
    
    sa.deposit(10)
    sa.deposit(10)
    sa.deposit(10)
    println(sa)
    sa.deposit(10)
    println(sa)
    sa.earnMonthlyInterest
    sa.deposit(10)
    println(sa)
    sa.withdraw(20)
    sa.withdraw(20)
    println(sa)
    sa.withdraw(20)    
    println(sa)
    
  } 
}