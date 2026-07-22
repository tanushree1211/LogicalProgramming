package com.rcb.numberproblems;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int fact=Program16.getFactorial(n);
		System.out.println(fact);
	}
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	

}
