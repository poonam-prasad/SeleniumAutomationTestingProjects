package com.InheritanceDemos;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Manager m1=new Manager();
		m1.displayData();
		System.out.println("Net Salary "+m1.calculateSalary());
		
		System.out.println("=========================");
	
		Manager m2=new Manager(123,"Kavita",50000,"Female",50000,0.5);
		m2.displayData();
		
		Manager m3=new Manager(111,"Test",50000,"Female",50000,0.5);
		System.out.println(m3);
		
	}

}
