package com.rcb.numberproblems;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eleigible to vote");
		}
	}

}
