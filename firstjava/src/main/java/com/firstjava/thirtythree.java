package com.firstjava;
import java.util.Scanner;

public class thirtythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter total number of numbers");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter numbers");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int ans= avg(arr,n);
System.out.println("average is "+ ans);
	}
	static int avg(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum/n;
	}

}
