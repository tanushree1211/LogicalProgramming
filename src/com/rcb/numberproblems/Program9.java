package com.rcb.numberproblems;
//wajp to check the given number is prime or not
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
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
