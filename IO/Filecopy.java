package com.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Filecopy {
	public static void main(String[] args) throws Exception {
	String source ="C:\\Users\\admin\\Documents\\Seema.txt";
    String out =    "C:\\Users\\admin\\Documents\\seema6.txt";
    FileReader reader = new FileReader(source);
    FileWriter writer = new FileWriter(out);
      int ch = reader.read();
      while(ch !=  -1) {
    	  writer.write(ch);
    	  ch = reader.read();
      }
      writer.close();
      reader.close();
      System.out.println("Source  ko copy kiya h out me");
	}
    
}
