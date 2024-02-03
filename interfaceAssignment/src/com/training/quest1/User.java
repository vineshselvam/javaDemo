package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter 's' for Student or 'e' for Employee:");
	        char userType = scanner.next().charAt(0);

	        Institute institute;

	        if (userType == 's') {
	            institute = new StudentCourses();
	            displayCourses(institute);
	        } else if (userType == 'e') {
	            institute = new EmployeeCourses();
	            displayCourses(institute);
	        } else {
	            System.out.println("Invalid input. Exiting...");
	        }
	}
	
	 private static void displayCourses(Institute institute) {
	        String[] courses = institute.showCourses();

	        System.out.println("Courses available:");

	        for (String course : courses) {
	            System.out.println(course);
	        }
	    }

}
