package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void findInsuranceScheme(Employee emp) {
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

