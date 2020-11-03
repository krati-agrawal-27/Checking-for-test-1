package com.firstjava;

import java.util.Scanner;

public class twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principle amount");
int P=sc.nextInt();
System.out.println("Enter intreset rate ");
int i=sc.nextInt();
System.out.println("Enter time period  ");
int t=sc.nextInt();
System.out.println("Simple interest is "+ P*i*t/100);
	}

}
