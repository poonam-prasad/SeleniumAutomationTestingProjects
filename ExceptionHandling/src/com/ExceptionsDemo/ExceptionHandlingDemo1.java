package com.ExceptionsDemo;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,4,5};
		int index;
		System.out.println("Enter any index");
		Scanner scn=new Scanner(System.in);
		index=scn.nextInt();
		
		try {
		System.out.println(arr[index]);
		}
		
		catch(NullPointerException ex)
		{
			System.out.println("NullPointerException");
		}
		/*catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBoundsException is there, please enter index till 4");
		}*/
		
		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException");
		}
		catch(SecurityException ex)
		{
			System.out.println("SecurityException");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		finally
		{
			System.out.println("This is Finally block");
		}
		System.out.println("Program ends");
	}

}
