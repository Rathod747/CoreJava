package com.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestwriteFile {
	public static void main(String[] args) throws Exception {
	FileWriter writer = new FileWriter("C:\\Users\\admin\\Documents//Seema.txt " , true);
	PrintWriter  pw = new PrintWriter(writer);
    pw.print("-------------");
	
	writer.close();
	System.out.println("check the fruits");
	

}
}