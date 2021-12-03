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
    public void checkSalary(List<Employee> employees){
        Predicate<Employee> employeePredicate = e1 -> e1.getSalary() > 40000.0;
        Predicate<Employee> employeePredicate1 = e1 -> e1.getSalary() < 50000.0;
        Predicate<Employee> filter = employeePredicate.and(employeePredicate1);
        for(Employee e: employees){
            if(filter.test(e))
            {
                System.out.println(e.getName()+"'s salary is greater than 40k and less than 50k");
            }
        }
    }
}
