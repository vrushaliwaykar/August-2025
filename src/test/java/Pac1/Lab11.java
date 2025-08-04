/*Create a program to accept date and print the duration in days, months and years with  regards to 
current system date.*/


package Pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab11 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter date (yyyy-mm-dd): ");
		String input=sc.nextLine();
		
		LocalDate inputDate=LocalDate.parse(input);
		
		LocalDate currentDate=LocalDate.now();
		
		Period duration=Period.between(inputDate, currentDate);
		
		System.out.println("Input Date: "+inputDate);
		System.out.println("Current Date: "+currentDate);
		System.out.println("-------------------------------------------");
		System.out.println("Duration from "+inputDate+" to "+currentDate+" :");
		System.out.println("Years: "+duration.getYears());
		System.out.println("Months: "+duration.getMonths());
		System.out.println("Days: "+duration.getDays());
		
		sc.close();
		

	}

}
