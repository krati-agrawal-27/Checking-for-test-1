package com.firstjava;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Input a number to check whether prime or not");
		int n=sc.nextInt();
		sc.close();
		int i;
		  if (n <= 1) {  
	           System.out.println("NUMBER IS NOT PRIME");  
	       }  
		  else {
			  for ( i = 2; i < n; i++) {  
		           if (n % i == 0) {  
		        	   System.out.println("NUMBER IS NOT PRIME");  
		           }  
		       }
			  if(i==n) System.out.println("NUMBER IS PRIME");  
		  }
	}

}
