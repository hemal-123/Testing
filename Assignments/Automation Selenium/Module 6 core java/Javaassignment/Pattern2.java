package Javaassignment;

public class Pattern2 {

	public static void main(System[] args) {
		int n=5;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i ; j++) {
				int sum=i+j;
				if(sum % 2==0) {
					System.out.print("1");
				}
					else {
						System.out.print("0");
						
						}
				}
			System.out.println();
		}
	}

}
