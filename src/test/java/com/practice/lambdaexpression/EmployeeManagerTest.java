package com.practice.lambdaexpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    public void createEmployee(){
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(12343, "Raj", 45000.0);
        Assertions.assertFalse(employeeManager.getEmployees().isEmpty());
        Assertions.assertEquals(1, employeeManager.getEmployees().size());
        Assertions.assertTrue(employeeManager.getEmployees().stream()
                .filter(employee -> employee.getSalary() > 40000 &&
                        employee.getSalary() < 50000).findAny().isPresent());
    }

}