package com.rcb.numberproblems;
//wajp to print all the perfect number b/w 1 to 100
public class Program8 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int sum=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}

}
