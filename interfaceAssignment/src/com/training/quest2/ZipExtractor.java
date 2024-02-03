package com.training.quest2;

public class ZipExtractor implements Extractor{
	public void extractFiles(String... filenames) {
        System.out.println("Extracting from zip => files as .txt, .jpeg, .doc files");
        for (String filename : filenames) {
            System.out.println("Extracting file: " + filename);
        }
    }
}
