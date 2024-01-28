package com.training.assignmentabs;

public class Developer extends TeamLead {
	 double chargesPerHour;
	    String sportsName;

	   
	    public Developer(String empName, double salary, int empId, double chargesPerHour, String sportsName) {
	        super(empName, salary, empId);
	        this.chargesPerHour = chargesPerHour;
	        this.sportsName = sportsName;
	    }

	    
	    void calcBonus(double amount) {
	    	
	    	System.out.println("Developer Bonus"+ (amount+salary));
	    }

	    String[] showCourses() {
	        
	        return new String[]{"react", "angular"};
	    }

	    void showProjects() {
	    	 System.out.println("amazon");
	    }

	    void gamesClub() {
	        System.out.println(sportsName + " " + chargesPerHour);
	    }
}
