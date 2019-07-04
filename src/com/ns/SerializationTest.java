package com.ns;

public class SerializationTest {
	public static void main(String[] args) {
		String fileName = "employee2.ser";
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("navin");
		emp.setSlalry(50000);
		Employee.setAge(25);
		SerializationUtil.serialize(emp, fileName);
		Employee newEmp = (Employee) SerializationUtil.deserialize(fileName);
		System.out.println(emp);
		System.out.println(newEmp);
	}
}
