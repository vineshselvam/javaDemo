package com.training.oops;

public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Employee employee = new Employee();
		  System.out.println(employee.employeeName);
		  employee.employeeName = "Priya";
		  employee.employeeId = 10;
		  employee.salary =2000;
		  employee.getDetails();
		  String result = employee.greet("have a great day");
		  System.out.println(result);
		Employee employee1 = new Employee();
		  System.out.println(employee1.employeeName);
	}

}
