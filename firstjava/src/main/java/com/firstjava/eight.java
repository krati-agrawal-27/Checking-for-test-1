package com.firstjava;

import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Input number to be reversed");
		int n=sc.nextInt();
		int x = 0; 
        while(n > 0) 
        { 
            x = x * 10 + n % 10; 
            n = n / 10; 
        } 
        System.out.println(x); 
	}

}
