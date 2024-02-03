package com.training.quest2;

public class RarExtractor implements Extractor{
	 public void extractFiles(String... filenames) {
	        System.out.println("Extracting from rar => files as .tex files from Linux OS");
	        for (String filename : filenames) {
	            System.out.println("Extracting file: " + filename);
	        }
	    }
}
