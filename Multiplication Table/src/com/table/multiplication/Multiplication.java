package com.table.multiplication;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the table number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for (int i=0;i<10;System.out.println(x+" X "+i+ " = " +x*i))
		{
			i++;
		}
		
		
		sc.close();
		
   
	}

}
