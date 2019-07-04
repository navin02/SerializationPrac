package com.ns.extrenal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {
	private static final long serialVersionUID = 6261837473187279525L;
	private String name;
	transient private int age;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		//out.writeInt(this.age);
		out.writeObject(this.name + "xyz");
		//out.writeInt(this.salary);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//this.age = in.readInt();
		this.name = (String) in.readObject();
		if (!this.name.endsWith("xyz"))
			throw new IOException("Corrupted Data");

		//this.salary = in.readInt();
	}

	public String toString() {
		return "Person[name " + this.name + " age " + this.age + " salary " + this.salary + "]";
	}
}
