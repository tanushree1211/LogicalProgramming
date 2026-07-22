package com.rcb.numberproblems;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Program19.getFactorial(n);
	}
	public static void getFactorial(int n)
	{
		int f=1;
		while(f<=n)
		{
			int fact=1;
			for(int i=1;i<=f;i++)
			{
				fact=fact*i;
			}
			System.out.println("factorial of "+f+" -> "+fact);
			f++;
		}
	}
}
