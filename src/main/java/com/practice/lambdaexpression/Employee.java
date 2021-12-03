package com.practice.lambdaexpression;

public class Employee {

    private int employeeNumber;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeNumber, String name, double salary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
