package com.fact;

import java.util.Scanner;

public class First {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" = "+factorial(n));

 

	}
	public static int factorial(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		fact=fact*i;
		return fact;
	}
}
