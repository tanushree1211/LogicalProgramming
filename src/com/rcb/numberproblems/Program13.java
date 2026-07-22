package com.rcb.numberproblems;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		int count=0;
		for(int i=2;i<=sum/2;i++)
		{
			if(sum%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
