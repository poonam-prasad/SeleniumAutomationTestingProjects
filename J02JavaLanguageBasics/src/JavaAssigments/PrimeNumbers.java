package JavaAssigments;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("PFB the list of Prime Numbers between 1 to 100 ");
	
		int i,j;
		
		for(i=2;i<=100;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}	
			
			if(i==j)
			System.out.print(i+" , ");
		}
				
		}
	
}
