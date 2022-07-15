package com.rays.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Testfile3 {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Users\\admin\\Documents//Seema.txt");
	    int ch = reader.read();
	    System.out.println(ch);
	    
	    char chr;
	    
	    while (ch != -1) { 
	    	
	    	System.out.println(ch);
	    	ch = reader.read();
		}
	
		
		
	}

}
