package com.rcb.numberproblems;

import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Program18.printTable(n);
	}
	public static void printTable(int n)
	{
		int t=1;
		while(t<=n)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(t+" * "+i+" = "+(t*i));
			}
			System.out.println();
			t++;
		}
	}

}
