package Pac1;

import java.util.Scanner;

public class Lab1_15_PersonMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        Lab1_15_Person p = new Lab1_15_Person("Vrushali", "Waykar", 'F');

        
        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        String dob = sc.nextLine();

        
        int age = p.calculateAge(dob);

        
        String fullName = p.getFullName(p.getFirstName(), p.getLastName());

        // Display details
        System.out.println("\nPerson Details");
        System.out.println("-----------------");
        System.out.println("Full Name: " + fullName);
        System.out.println("Gender: " + p.getGender());
        System.out.println("Age: " + age);

        sc.close();

	}

}
