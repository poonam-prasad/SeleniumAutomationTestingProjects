package com.BasicDemos;

import java.util.Scanner;

public class D05SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		
		System.out.println("Enter Day No: ");
		 Scanner scn= new Scanner(System.in);
		 day=scn.nextInt();
		 
		 switch(day) {
			 case 1: System.out.println("Sunday");
			 break;
			 case 2: System.out.println("Monday");
			 break;
			 case 3: System.out.println("Tuesday");
			 break;
			 case 4: System.out.println("Wednesday");
			 break;
			 case 5: System.out.println("Thursday");
			 break;
			 case 6: System.out.println("Friday");
			 break;
			 case 7: System.out.println("Saturday");
			 break;
			 default:
				 System.out.println("Wrong Input: "+day);
				 
	}

	}
}
