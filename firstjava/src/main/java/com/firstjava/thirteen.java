package com.firstjava;

import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the radius of circle");
		int n= sc.nextInt();
		System.out.println(area(n));
	}
	static double area(int n) {
		return 3.14*n*n;
	}

}
