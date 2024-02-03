package com.training.quest2;

public class JarExtractor implements Extractor{
	public void extractFiles(String... filenames) {
        System.out.println("Extracting from jar => files as .class files");
        for (String filename : filenames) {
            System.out.println("Extracting file: " + filename);
        }
    }
}
