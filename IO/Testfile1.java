package com.rays.IO;

import java.io.File;

public class Testfile1 {
	public static void main(String[] args) {
	 
	 File directory = new File("C:\\Users"); 
	 String[] list  = directory.list();
	 for(String string : list) {
		 System.out.println(string);
	 }
		
	}

}
