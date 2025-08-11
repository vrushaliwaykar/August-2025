package Pac1;

import java.util.Scanner;

public class Lab1_8_PersonMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Lab1_8_Person  p = new Lab1_8_Person("Vrushali","Waykar",Gender.F,"8976543213");
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		
		System.out.println("Phone No: " + p.getphoneNumber());
		sc.close();

	}

}
