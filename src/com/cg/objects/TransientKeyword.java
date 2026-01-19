package com.cg.objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TransientExample example = new TransientExample();

		System.out.println("User Id: " + example.userId);
		System.out.println("Password: " + example.password);
		System.out.println("a = " + example.a);

		FileOutputStream fos = new FileOutputStream("D:\\Documents\\Data_Structures.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(example);

		FileInputStream fis = new FileInputStream("D:\\Documents\\Data_Structures.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		TransientExample output = (TransientExample) ois.readObject();
		
		System.out.println("User Id: " + output.userId);
		System.out.println("Password: " + output.password);
		System.out.println("a = " + output.a);
	}
}

class TransientExample implements Serializable {
	int a = 10;
	transient String userId = "admin";
	transient String password = "India@123";

}
