package com.rays.IO;

import java.io.File;

public class Testfile2 {
	public static void main(String[] args) {
		File f = new File("C:\\Rays");
		File [] list =  f.listFiles();
		for(int i = 0; i<list.length;  i++) {
			if(list[i].isFile()) {
				System.out.println((i+1)+ ": "+ list[i].getName());
			}
		}
	}

}
