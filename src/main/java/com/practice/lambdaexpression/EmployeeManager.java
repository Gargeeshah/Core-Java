package com.practice.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManager {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(int id, String name, double salary){
        Employee employee = new Employee(id, name, salary);
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
   
}
