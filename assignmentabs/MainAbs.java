package com.training.assignmentabs;

public class MainAbs {
	 public static void main(String[] args) {
	        // Call using superclass reference
		
		  Employee emp = new Developer("rahul", 3000, 1666, 15, "Cricket");
	       
	        emp.showProjects();
	        emp.calcBonus(5000);
	        emp.showRules();
	        emp.printDetails();

	        Developer developer = (Developer) emp;
	        developer.gamesClub();
		 
		 
		 
		 Employee employee = new Manager("vinesh", 50000, 827484, "foodball");
	        employee.calcBonus(7000);
	       
	        employee.showProjects();
	        employee.showRules();
	        employee.printDetails();
	        
	        Manager manager = (Manager) employee;
	        manager.funClub();

	      

	       
	    }
}
