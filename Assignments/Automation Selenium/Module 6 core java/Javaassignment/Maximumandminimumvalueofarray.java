package Javaassignment;

public class Maximumandminimumvalueofarray {
	
	public static void main(String[] args) {
	 int a[] = {11,52,22,21,45};
	 int max = a[0];
	 
	 for(int i=1;i<a.length;i++)
	 {
		 if (a[i]>max) {
			 max=a[i];
		 }
		 System.out.println("maximum value of array is:"+max);
		 
		 int b[] = {5,15,25,35,45};
			int min= b[0];
			for (int j=1;i<b.length;i++)
				{ 
				if (a[i] < min) {
					min =a[i];
				}
				
			}
			System.out.println("Minimum value  of array is :" +min);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	}


}
