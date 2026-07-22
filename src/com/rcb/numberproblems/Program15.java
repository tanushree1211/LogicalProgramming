package com.rcb.numberproblems;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Program15.printTable(n);
	}
	public static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
