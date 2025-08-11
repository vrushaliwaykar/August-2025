package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Lab2_3_Employee;
import com.cg.eis.service.Lab2_3_EmployeeService;
import com.cg.eis.service.Lab2_3_EmployeeServiceImpl;

public class Lab2_3_MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get employee details
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation (Manager / Developer / Clerk): ");
        String designation = sc.nextLine();

        // Create employee object
        Lab2_3_Employee emp = new Lab2_3_Employee(id, name, salary, designation);

        // Call service to assign insurance scheme
        Lab2_3_EmployeeService service = new Lab2_3_EmployeeServiceImpl();
        service.findInsuranceScheme(emp);

        // Display employee details
        emp.displayDetails();
        
        sc.close();
    }
}

