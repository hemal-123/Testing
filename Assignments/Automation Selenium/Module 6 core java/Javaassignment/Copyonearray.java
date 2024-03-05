package Javaassignment;

public class Copyonearray {

	public static void main(String[] args) {
		int num1[] = { 25, 35, 45, 55, 65 };
		int num2[] = num1.clone();

		System.out.println("Array num1 [] ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");

		}
		System.out.println("\n\nArray num2[] ");

		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
	}

}
}
