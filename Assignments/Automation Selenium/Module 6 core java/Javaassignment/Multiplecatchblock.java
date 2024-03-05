package Javaassignment;

public class Multiplecatchblock {

	
		public static void main(String[] args) {

			try {
				int a[] = new int[5];
				a[3] = 50 / 0;
			} catch (ArithmeticException e) {
				System.out.println("cannot divide by 0 ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("given value of index is  out of limit");
			} catch (Exception e) {
				System.out.println("Something  went Wrong..");
			}
			System.out.println("furthur code continue..");
	}

}
