package Pac1;

import java.util.Scanner;

public class Lab1_7_PersonMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Lab1_7_Person  p = new Lab1_7_Person("Vrushali","Waykar",'F',"8976543213");
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		
		System.out.println("Phone No: " + p.getphoneNumber());
		sc.close();

	}

}
