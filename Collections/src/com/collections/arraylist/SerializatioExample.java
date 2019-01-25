package com.collections.arraylist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializatioExample {

	static void serialize() throws IOException {
		Student s = new Student("Raju", "1");

		try {
			FileOutputStream file = new FileOutputStream("./test.txt");

			ObjectOutputStream ob = new ObjectOutputStream(file);

			ob.writeObject(s);
			ob.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void deSerialize() throws IOException, ClassNotFoundException {

		FileInputStream file;
		try {
			file = new FileInputStream("./test.txt");
			ObjectInputStream ob = new ObjectInputStream(file);

			Student s = (Student) ob.readObject();
			ob.close();
			System.out.println(" Stundent Id : " + s.getId() + " name" + s.getName());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] a) {
		try {
			serialize();
			deSerialize();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Student implements Serializable{

	private String name;

	private String id;

	Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}