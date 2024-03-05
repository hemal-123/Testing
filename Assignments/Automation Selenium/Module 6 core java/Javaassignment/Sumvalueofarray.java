package Javaassignment;

import java.util.Scanner;

public class Sumvalueofarray {

	public static void main(String[] args) {
		
		int a[]=new int[5]; int sum=0;
		Scanner r=new Scanner(System.in);
		System.out.print("enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
			}
		System.out.print("array element");
		for(int i=0;i<a.length;i++)
		{
		   System.out.print(a[i]+" ");
		   sum=a[i]+sum; 
		   
		}
		System.out.print("\n Addition of array element"+sum);
	}
	

}
