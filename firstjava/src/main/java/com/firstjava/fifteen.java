package com.firstjava;

import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two numbers to swap");
		int a= sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}

}
