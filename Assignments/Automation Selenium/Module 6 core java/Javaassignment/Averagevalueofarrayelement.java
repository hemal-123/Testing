package Javaassignment;

import java.util.Scanner;

public class Averagevalueofarrayelement {

	public static void main(String[] args) {
		int a[]=new int[5]; int sum=0; double avg;
		Scanner r=new Scanner(System.in);
		System.out.print("enter array element");
		for(int i=0;i<5;i++)
		{
			a[i]=r.nextInt();
			System.out.print("array element");
			}
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
			
			}
		for(int i=0;i<5;i++)
		{
			sum=a[i]+sum;
			
			}
		avg=sum%.5;
		System.out.print("/n Addition"+sum+"/n Average "+avg);
	}

}
