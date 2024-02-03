package com.training.quest3;

import java.util.Scanner;

public class Customer {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter 'basic' for Basic Mobile, 'touch' for Touchscreen Mobile:");
	        String phoneType = scanner.next();

	        FeaturePhone fmobile;
	        SmartPhone smobile;

	        if (phoneType.equals("basic")) {
	        	fmobile = new BasicMobile();
	        	fmobile.call();
	        	fmobile.messaging();

	        } else if (phoneType.equals("touch")) {
	        	smobile = new TouchScreenMobile();
	        	smobile.showApps();
	        	smobile.cameraTypes();
	        } else {
	            System.out.println("Invalid input. Exiting...");
	            return;
	        }

	        
	       
	       
	       
	    }
}
