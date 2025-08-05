package Pac1;

public class Lab2_1_Main 
{
	public static void main(String[] args)
	{
		Lab2_1_Person smith=new Lab2_1_Person("Smith",30);
		Lab2_1_Person kathy=new Lab2_1_Person("kathy",25);
	
		Lab2_1_Account smithAccount=new Lab2_1_Account(2000,smith);
		Lab2_1_Account kathyAccount=new Lab2_1_Account(3000,kathy);
		
		smithAccount.deposit(2000);
		kathyAccount.withdraw(2000);
		
		System.out.println("Smith's Account: ");
		System.out.println(smithAccount);
		System.out.println();
		
		System.out.println("kathy's Account: ");
		System.out.println(kathyAccount);
		
	
	
	
	}

}
