package com.training.quest2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter 'z' for Zip, 'j' for Jar, 'r' for Rar:");
	        char fileType = scanner.next().charAt(0);

	        Extractor extractor;

	        if (fileType == 'z') {
	            extractor = new ZipExtractor();
	        } else if (fileType == 'j') {
	            extractor = new JarExtractor();
	        } else if (fileType == 'r') {
	            extractor = new RarExtractor();
	        } else {
	            System.out.println("Invalid input. Exiting...");
	            return;
	        }

	        System.out.println("Enter filenames (separated by space):");
	        scanner.nextLine(); 
	        String[] filenames = scanner.nextLine().split("\\s+");

	        extractor.extractFiles(filenames);
	}

}
