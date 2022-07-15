package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readlinebylline {
	public static void main(String[] args) throws Exception {
		FileReader r = new FileReader("C:\\Users\\admin\\Documents\\Madhuri.txt");
		BufferedReader br = new BufferedReader(r);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
			
		}
		r.close();
		
	}

}
