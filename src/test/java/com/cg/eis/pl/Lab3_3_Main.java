package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.exception.Lab3_3_EmployeeException;

public class Lab3_3_Main 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            if (sal < 3000) throw new Lab3_3_EmployeeException("Salary must be >= 3000");
            System.out.println("Valid Salary: " + sal);
        } catch (Lab3_3_EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}