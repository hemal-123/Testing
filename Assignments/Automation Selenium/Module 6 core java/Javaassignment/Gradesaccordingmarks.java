package Javaassignment;

import java.util.Scanner;

public class Gradesaccordingmarks {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter marks : ");
			int m = sc.nextInt();
			if (m <= 35) {
				System.out.println("You Are Fail");
			} else if (m > 35 && m <= 48) {
				System.out.println("Grade : DD");
			} else if (m >= 49 && m <= 58) {
				System.out.println("Grade : CD");
			} else if (m >= 59 && m <= 72) {
				System.out.println("Grade : BC");
			} else if (m >= 73 && m <= 82) {
				System.out.println("Grade : BB");
			} else if (m >= 83 && m <= 91) {
				System.out.println("Grade : AB");
			} else if (m >= 92 && m <= 100) {
				System.out.println("Grade : AA");
			} else {
				System.out.println("invalid input");
	}

}
}
