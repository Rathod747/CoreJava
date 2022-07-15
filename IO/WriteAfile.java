package com.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAfile {

public static void main(String[] args) throws Exception   {
	FileWriter fr = new FileWriter("C:\\Users\\admin\\Gopi.txt" ,  true);
	PrintWriter pw = new PrintWriter(fr);
	//for(int i = 0; i<5; i++) {
	//pw.println(i + ":Line");
//}
	pw.println("One");
	pw.println("Two");
	pw.println("Three");
	pw.println("four");
	pw.println("five");
	
    pw.close();
    fr.close();
    System.out.println("File is written");
}
}