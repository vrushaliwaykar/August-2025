//accept two LocalDates and print the duration between dates in  days, months and years.

package Pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first date (yyyy-mm-dd): ");
		String input1=sc.nextLine();
		LocalDate date1=LocalDate.parse(input1);
		
		System.out.println("Enter second date (yyyy-mm-dd): ");
		String input2=sc.nextLine();
		LocalDate date2=LocalDate.parse(input2);
		
		LocalDate startDate=date1.isBefore(date2)?date1:date2;
		LocalDate endDate=date1.isBefore(date2)?date2:date1;
		
		Period duration=Period.between(startDate, endDate);
		
		System.out.println("\nStart Date 1: "+startDate);
		System.out.println("End Date 2: "+endDate);
		
		System.out.println("\nDuration from "+startDate+" to "+endDate+" :");
		System.out.println("Years: "+duration.getYears());
		System.out.println("Months: "+duration.getMonths());
		System.out.println("Days: "+duration.getDays());
		
		sc.close();
	}
}
