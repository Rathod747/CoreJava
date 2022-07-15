package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Testing1 {
	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\admin\\Pictures\\Screenshots\\One.png";
	   String target = "C:\\Users\\admin\\Pictures\\Screenshots\\two.png";
	   FileInputStream f = new FileInputStream(source);
	   FileOutputStream fr =  new FileOutputStream(target);
	   int ch = f.read();
	   while (ch != -1) {
		fr.write(ch);
		ch = f.read();
		
	}
	   f.close();
	   fr.close();
	   System.out.println("completed");
	}

}
