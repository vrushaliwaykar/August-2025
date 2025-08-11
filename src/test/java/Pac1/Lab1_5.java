package Pac1;

import java.util.Scanner;

public class Lab1_5 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num =sc.nextInt();
		
		if (num>0)
		{
			System.out.println(num+" is Positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is Negative number");
		}
		else
		{
			System.out.println("Number is zero");
		}
		sc.close();
	}

}
