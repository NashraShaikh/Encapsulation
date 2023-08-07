package com.jsp.encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.setEid(50);
		employee.setEname("Nashra Shaikh");
		employee.setDesignation("Developer");
		
	System.out.println("EID:"+ employee.geteid());
	System.out.println("ENAME:"+ employee.getEname());
	System.out.println("DESIGNATION:"+ employee.getDesignation());
	
	}

}
