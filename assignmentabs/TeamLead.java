package com.training.assignmentabs;

public class TeamLead extends Employee{
	
    public TeamLead(String empName, double salary, int empId) {
        super(empName, salary, empId);
    }

    
    void calcBonus(double amount) {
    	System.out.println(amount); 
    }

	@Override
	String[] showCourses() {
		
		return new String[]{"cpp", "python"};
	}

	@Override
	void showProjects() {
		
		System.out.println("Flipkart");
	}
}
