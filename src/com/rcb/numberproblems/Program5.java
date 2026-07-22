package com.rcb.numberproblems;
//WAJP to print sum of n natural numbers
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum: "+sum);
	}
}
