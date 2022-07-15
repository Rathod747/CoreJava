package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestKeyboardprint {
	public static void main(String[] args) throws Exception {
		 
		String target = "C:\\Users\\admin\\Documents\\keyboardprint.txt ";
		FileWriter writer = new FileWriter(target);
		PrintWriter printwriter = new PrintWriter(writer);
		System.out.println("Start typing");
		
		InputStreamReader   i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		
		String l = b.readLine();
		while(!l.equals("quit")) {
			
		
		printwriter.println(l);
		l= b.readLine();
		
		
	}
	printwriter.close();
	i.close();
	System.out.println("Stop the print");
	}
}
