package Javaassignment;

import java.util.Scanner;

public class Factorial {

	
		public static void main (String[] args) {
			int n , fact =1;
			System.out.println("Enter any number : ");
			Scanner sc = new Scanner(System.in);
			n= sc.nextInt();
			
			for (int a=1; a<=n; a++)
			{
				fact = fact*a;
				
			}
			System.out.print("factorial of given number is "   +  fact);
	}

}
