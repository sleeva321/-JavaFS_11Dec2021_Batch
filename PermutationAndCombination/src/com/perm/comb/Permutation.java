package com.perm.comb;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		System.out.println("Value of n entered="+n+"\nValue of r entered="+r);
		System.out.println("NCR is "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.print("\nNPR is " +(fact(n)/(fact(n-r))));
		
		sc.close();

	}

	public static int fact(int num) {
		int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
		return fact;
	}
	
	
	
}
