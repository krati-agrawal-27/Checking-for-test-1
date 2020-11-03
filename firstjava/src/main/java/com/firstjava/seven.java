package com.firstjava;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Input number or array length");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println(" Input integers for the array");
		int sum=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			array[i]=x;
			sum=sum+x;
		}
		System.out.println(sum/n);
	}

}
