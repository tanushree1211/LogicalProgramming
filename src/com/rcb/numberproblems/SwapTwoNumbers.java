package com.rcb.numberproblems;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a=s.nextInt();
		System.out.println("Enter the second number ");
		int b=s.nextInt();
		System.out.println("Before swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}

}
