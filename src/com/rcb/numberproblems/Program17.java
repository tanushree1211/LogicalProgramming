package com.rcb.numberproblems;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int d=n%10;
			sum=sum+getFactorial(d);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}
	public static int getFactorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
