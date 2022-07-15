package com.rays.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:\\Users\\admin\\Shanu123.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		
		Employee e = new Employee(1 , "Mitesh" , "101sro");
		out.writeObject(e);
		out.close();
		System.out.println("Object is print successful");
}

}
