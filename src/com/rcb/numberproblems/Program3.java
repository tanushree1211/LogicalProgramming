package com.rcb.numberproblems;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Not a even number");
		}
	}

}
