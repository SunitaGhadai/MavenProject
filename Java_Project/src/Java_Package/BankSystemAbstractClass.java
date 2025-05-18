package Java_Package;

public class BankSystemAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingAccount myAccount= new SavingAccount(1000, "45672439905");			
myAccount.showAccountDetails();
myAccount.deposit(2000.00);
myAccount.withdraw(1000.00);
System.out.println("Final Balance in my account " + myAccount.checkBalance());
	}

}

abstract class bankAccount
//Global
{
private double Balance;

public bankAccount(double InitialBalance)
{
	Balance = InitialBalance;
}

public void deposit (double amount)
{
	if (amount>0)
	{
		Balance+=amount;
		System.out.println("deposit "+amount);
	}
	else
	{
		System.out.println("The amount must be positive");
	}
	
}
public void withdraw (double amount)
{
	if (amount>0 && amount<= Balance)
	{
		Balance-=amount;
		System.out.println("Withdraw "+amount);
	}
	else
	{
		System.out.println("Insufficient Balance");
	}
}
public double checkBalance()
{
	return Balance;
}

abstract void showAccountDetails();

}

class SavingAccount extends bankAccount
{
private String accountNumber;
	public SavingAccount(double InitialBalance ,String accountNumber) {
		super(InitialBalance);
		this.accountNumber=accountNumber;
	}

	@Override
	void showAccountDetails() {
		// TODO Auto-generated method stub
		System.out.println("The account holder number "+ accountNumber);
		System.out.println("The balance in account "+ checkBalance());
	}
	
}










