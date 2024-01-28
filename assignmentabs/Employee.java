package com.training.assignmentabs;

public abstract class Employee {
	String empName;
    double salary;
    int empId;
    final String COMPANYNAME = "";

   
    public Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }

    
    void printDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    
    abstract void calcBonus(double amount);

    abstract String[] showCourses();

    abstract void showProjects();

   
    final void showRules() {
        officeHours();
        System.out.println("Leave policies");
        System.out.println("OD policies");
    }

   
    private void officeHours() {
        System.out.println("8 hours per day");
    }
}
