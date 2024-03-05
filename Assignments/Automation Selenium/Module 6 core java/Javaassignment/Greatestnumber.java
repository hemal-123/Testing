package Javaassignment;

import java.util.Scanner;

public class Greatestnumber {

	
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter 1st Number : ");
			int n1 = scan.nextInt();

			System.out.print("Enter 2nd Number : ");
			int n2 = scan.nextInt();

			System.out.print("Enter 3rd Number : ");
			int n3 = scan.nextInt();

			if (n1 > n2)
				if (n1 > n3)
					System.out.print(" The largest number is " + n1);
			if (n2 > n1)
				if (n2 > n3)
					System.out.print(" The largest number is " + n2);

			if (n3 > n1)
				if (n3 > n2)
					System.out.print(" The largest number is " + n3);
		}
	

}
