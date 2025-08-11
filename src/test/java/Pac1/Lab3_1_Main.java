package Pac1;

public class Lab3_1_Main 
{
		public static void main(String[] args)
		{
			try
			{
				Lab3_1_Person p=new Lab3_1_Person("vrushali","waykar");
				p.display();
			}
			catch(InvalidNameException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}
	
}
