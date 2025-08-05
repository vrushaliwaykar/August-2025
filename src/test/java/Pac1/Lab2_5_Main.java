package Pac1;

public class Lab2_5_Main
{
	// Main class
		    public static void main(String[] args)
		    {
		    	Lab2_5_Person smith = new Lab2_5_Person("Smith", 30);
		    	Lab2_5_Person kathy = new Lab2_5_Person("Kathy", 25);

		        BankAccount smithAcc = new BankAccount(2000, smith);
		        BankAccount kathyAcc = new BankAccount(3000, kathy);

		        // a) Deposit 2000 to Smith
		        smithAcc.deposit(2000);

		        // b) Withdraw 2000 from Kathy
		        kathyAcc.withdraw(2000);

		        // c + d) Show balances
		        System.out.println("\n--- Final Account Details ---");
		        System.out.println(smithAcc);
		        System.out.println(kathyAcc);
		    }
		

}
