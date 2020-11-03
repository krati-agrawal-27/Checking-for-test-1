package com.firstjava;

import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number to find factorial");
		int n= sc.nextInt();
		int f= fact(n);
		System.out.println("Factorial of " + n+" is " + f );
	}
	static int fact(int n) {
		 int multi=1;
		while(n>1) {
			multi=multi*n;
			n=n-1;
		}
		return multi;
	}

}
