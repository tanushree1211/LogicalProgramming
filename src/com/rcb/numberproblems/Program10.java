package com.rcb.numberproblems;
//wjp to print the sum of digits in a given number
import java.util.Scanner;

public class Program10 {
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
		System.out.println("Sum of digits:"+sum);
	}

}
