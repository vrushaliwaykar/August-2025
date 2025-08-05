package Pac1;

public class Lab2_1_Account
{
	private static long accCounter=1000;
	private long accNum;
	private double balance;
	private Lab2_1_Person accHolder;
	
	public Lab2_1_Account(double balance,Lab2_1_Person accHolder) 
	{
		this .accNum=accCounter++;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if (balance-amount>=500)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Cannot withdraw amount");
		}
		
	}
	public double getBalance()
	{
		return balance;
	}
	public long getAccNum()
	{
		return accNum;
	}
	public Lab2_1_Person getAccHolder()
	{
		return accHolder;
	}
	public void setAccHolder(Lab2_1_Person accHolder)
	{
		this.accHolder=accHolder;
	}
	@Override
	public String toString()
	{
		return "Account Number: "+accNum+"\nHolder: "+accHolder+"\nbalance: "+balance;
	}
}
