package com.rays.IO;

import java.io.File;

public class Testf {
	public static void main(String[] args) {
		File  f= new File("C:\\Users\\admin\\Desktop/abc.text");
		String[] list = f.list();
		for(int i = 0; i<f.length();  i++);
		File f1 = new File ("C:\\Users\\admin\\Desktop\\abc.text");
		if (f1.isFile()) {
			System.out.println((i+1) + ":"  + list[i]);
		}
	}

}
