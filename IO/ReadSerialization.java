package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadSerialization {
	public static void main(String[] args) throws Exception {
		FileInputStream  f  = new FileInputStream("C:\\\\Users\\\\admin\\\\Shanu123.txt");
		ObjectInputStream out = new ObjectInputStream(f);
		Employee w =  (Employee)out.readObject();
		System.out.println(w.getId());
		System.out.println(w.getName());
		System.out.println(w.getPwd());
		
		
}

}
