package com.ns.inheritance;



import com.ns.SerializationUtil;

public class InheritanceSerializationTest {

	public static void main(String[] args) {
		String fileName = "subclass.ser";
		
		SubClass subClass = new SubClass();
		subClass.setId(10);
		subClass.setValue("Data");
		subClass.setName("Pankaj");
		
		
			SerializationUtil.serialize(subClass, fileName);
		
		
		
			SubClass subNew = (SubClass) SerializationUtil.deserialize(fileName);
			System.out.println("SubClass read = "+subNew);
	
	}
}
