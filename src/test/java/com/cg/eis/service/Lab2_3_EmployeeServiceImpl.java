package com.cg.eis.service;

import com.cg.eis.bean.Lab2_3_Employee;

public class Lab2_3_EmployeeServiceImpl implements Lab2_3_EmployeeService {

    @Override
    public void findInsuranceScheme(Lab2_3_Employee emp) {
        if (emp.salary >= 50000 && emp.designation.equalsIgnoreCase("Manager")) {
            emp.insuranceScheme = "Premium Scheme";
        } else if (emp.salary >= 30000 && emp.designation.equalsIgnoreCase("Developer")) {
            emp.insuranceScheme = "Standard Scheme";
        } else if (emp.salary >= 20000 && emp.designation.equalsIgnoreCase("Clerk")) {
            emp.insuranceScheme = "Basic Scheme";
        } else {
            emp.insuranceScheme = "No Scheme";
        }
    }
}

