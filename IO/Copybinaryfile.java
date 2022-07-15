package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copybinaryfile {
	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\admin\\Pictures\\Screenshots\\1.png";
		String target = "C:\\Users\\admin\\Pictures\\Screenshots\\2.png";
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream  writer = new FileOutputStream(target);
		int ch = reader.read();
		while(ch != -1) {
			writer.write(ch);
			ch = reader.read();
			
		}
		writer.close();
		reader.close();
		System.out.println("source is copy to target");
	}
	

}
