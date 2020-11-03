package com.firstjava;

import java.util.Scanner;

public class eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number till which ypou want armstrong numbers to be printed");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(check(i)==true) System.out.println(i);
		}
	}
	static boolean check(int n) {
		int a;
		int c=0;
		 int temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c) return true;
		    else return false;
	}

}
