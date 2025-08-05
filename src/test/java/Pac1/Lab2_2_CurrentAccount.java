package Pac1;

public class Lab2_2_CurrentAccount extends Lab2_2_Account  
{
	private double overdraftLimit;
	public Lab2_2_CurrentAccount(String accountNumber,double balance,double overdraftLimit)
	{
		super(accountNumber,balance);
		this.overdraftLimit=overdraftLimit;
	}
	@Override
	public boolean withdraw(double amount)
	{
		if(balance-amount>=-overdraftLimit)
		{
			balance-=amount;
			System.out.println("Current Withdrawn: "+amount);
			return true;
		}
		else
		{
			System.out.println("Overdraft limit reached.");
			return false;
		}
	}
}
