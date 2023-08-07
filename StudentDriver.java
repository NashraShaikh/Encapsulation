package com.jsp.encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		student.setId(45);
		student.setName("Nashra Shaikh");
		student.setEmail("nash@gmail.com");
		student.setContactNumber(987654321);
		
		System.out.println("ID:" + student.getId());
		System.out.println("NAME:" + student.getName());
		System.out.println("EMAIL:" + student.getEmail());
		System.out.println("CONTACT NUMBER:" + student.getContactNumber());
	}

}
