package Pac1;

public class Lab2_2_Main 
{
	public static void main(String[] args)
	{
		Lab2_2_SavingsAccount savings=new Lab2_2_SavingsAccount("SA123",1000);
		Lab2_2_CurrentAccount current=new Lab2_2_CurrentAccount("CA123",1000,500);
	
		System.out.println("\n-----------Saving Account----------");
		savings.displayBalance();
		savings.withdraw(600);
		savings.withdraw(400);
		savings.displayBalance();
		
		
		System.out.println("\n-------------Current Account--------------");
		current.displayBalance();
		current.withdraw(1300);
		current.withdraw(300);
		current.displayBalance();
	}
	
	
	

}
