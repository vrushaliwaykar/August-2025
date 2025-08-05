package Pac1;

public class Lab2_2_SavingsAccount extends Lab2_2_Account 
{
	private final double minimumBalance=500.0;
	
	public Lab2_2_SavingsAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
	}
	@Override
	public boolean withdraw(double amount)
	{
		if(balance-amount>=minimumBalance)
		{
			balance-=amount;
			System.out.println("Savings Withdrawn: "+amount);
			return true;
		}
		else
		{
			System.out.println("withdrawal denied.");
			return false;
		}
	}
}
