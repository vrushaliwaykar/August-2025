package Pac1;

import java.time.LocalDate;

public class Lab13 
{
	public static void printwarrantyExpiry(LocalDate purchaseDate, int years,int months)
	{
		LocalDate expiryDate=purchaseDate.plusYears(years).plusMonths(months);
		System.out.println("Warranty expire date: "+expiryDate);
	}
	public static void main(String[] args) 
	{
		LocalDate purchaseDate=LocalDate.of(2023, 8, 4);
		int warrantyYears=2;
		int warrantyMonths=3;
		printwarrantyExpiry(purchaseDate,warrantyYears,warrantyMonths);

	}

}
