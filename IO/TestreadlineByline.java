package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestreadlineByline {
	public static void main(String[] args) throws Exception  {
		FileReader reader = new FileReader("C:\\Users\\admin\\Documents//Shanu.txt "); 
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while (line!= null ) {
			System.out.println(line);
			line = br.readLine();
			
			
		}
		reader.close();
		
	}

}
