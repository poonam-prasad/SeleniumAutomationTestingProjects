package com.InheritanceDemos;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp; //Reference of base class
		Manager m1=new Manager(123,"Kavita",50000,"Female",50000,0.5);  //Object of Child/Derived class
		emp=m1;//Reference of base class can hold object of derived class known as Generic reference
		emp.calculateSalary();
		System.out.println(emp);
		
		Employee e1=new Employee(222,"Tushar",50000,"Female");
		emp=e1;
		emp.calculateSalary();
		System.out.println(emp);
         
		//final double pi=3.142;
		//pi=3.980;
	}

}
