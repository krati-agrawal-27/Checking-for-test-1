package com.firstjava;

import java.util.Scanner;

public class ninteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int x=sc.nextInt();
int sum=0;
for(int i=0;i<n+1;i++) {
	sum=sum+pow(x,i)*fact(i);
}
System.out.println(sum);
	}
	static int pow(int x,int i) {
		int multi=1;
		for(int a=1;i<i+1;i++) {
			multi=multi*x;
		}
		return multi;
	}
	static int fact(int i) {
		int multi = 1;
		for(int j=1;j<i+1;j++) {
			multi=multi*j;
		}
		return multi;
	}

}
