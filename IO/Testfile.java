package com.rays.IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Testfile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/admin/Desktop/file/abc.text");
		f.createNewFile();
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
	        System.out.println(f.isDirectory());
			System.out.println(f.length() + "bytes long ");
			System.out.println(new Date(f.lastModified()));
			 
		}
	}
}