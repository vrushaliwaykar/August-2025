package Pac1;

import java.util.Scanner;

public class Lab6_PersonMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Lab6_Person p = new Lab6_Person("Vrushali","Waykar",'F');
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFirstName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		sc.close();

	}
	

}
