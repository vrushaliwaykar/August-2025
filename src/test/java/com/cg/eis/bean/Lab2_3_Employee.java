package com.cg.eis.bean;

public class Lab2_3_Employee 
{
	public int id;
    public String name;
    public double salary;
    public String designation;
    public String insuranceScheme;

    // Constructor
    public Lab2_3_Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Insurance Scheme: " + insuranceScheme);
    }
}

