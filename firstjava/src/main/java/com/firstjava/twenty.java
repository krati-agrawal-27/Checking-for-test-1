package com.firstjava;

import java.util.Arrays;
import java.util.Scanner;

public class twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter length of array");
int n =sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
	}

}
