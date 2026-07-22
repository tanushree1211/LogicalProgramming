package com.rcb.numberproblems;

import java.util.Scanner;

//wjp to print the number b/w 1 to n in reverse order
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.println(i);
		}
	}

}
