package com.rcb.numberproblems;

public class Program14 {
	public static void main(String[] args) {
		System.out.println("Palindrome number between 100 to 1000:");
		for(int i=100;i<=1000;i++)
		{
			int temp=i;
			int rev=0;
			while(temp>0)
			{
				int d=temp%10;
				rev=rev*10+d;
				temp=temp/10;
			}
			if(i==rev)
			{
				System.out.println(i+" ");
			}
		}
	}

}
