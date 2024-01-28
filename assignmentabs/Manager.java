package com.training.assignmentabs;

public class Manager extends Employee{
	  String activity;

	   
	    public Manager(String empName, double salary, int empId, String activity) {
	        super(empName, salary, empId);
	        this.activity = activity;
	    }

	   
	    void calcBonus(double amount) {
	    	System.out.println(" Bonus"+ (amount+salary));
	    }

	    String[] showCourses() {
	       
	        return new String[]{"java", "c"};
	    }

	    void showProjects() {
	    	System.out.println("myntra");
	    }

	    void funClub() {
	        System.out.println("Manager Activity " + activity);
	    }
}

