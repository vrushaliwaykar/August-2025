/*Extend the functionality through Inheritance and polymorphism (Maintenance)

Inherit two classes Savings Account and Current Account from account class. Implement  the following in the respective classes.

Savings Account
Add a variable called minimum Balance and assign final modifier.
Override method called withdraw (This method should check for minimum  balance and allow withdraw to happen)

Current Account
Add a variable called overdraft Limit
Overridemethod called withdraw (checks whether overdraft limit is reached  and returns a boolean value accordingly)*/


package Pac1;

public class Lab2_2_Account 
{
	protected String accountNumber;
	protected double balance;
	
	public Lab2_2_Account(String accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposited: "+amount);
	}
	
	public boolean withdraw(double amount)
	{
		if (amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrawn: "+amount);
			return true;
		}
		else
		{
			System.out.println("Insufficient balance");
			return false;
		}
	}
	public void displayBalance()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
