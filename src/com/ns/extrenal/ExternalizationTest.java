package com.ns.extrenal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationTest {
	public static void main(String[] args) {
		String fileName = "person.ser";
		Person pesrson = new Person();
		pesrson.setAge(20);
		pesrson.setName("navin");
		pesrson.setSalary(2000);
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pesrson);
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person person = (Person) ois.readObject();
			System.out.println(person);
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
