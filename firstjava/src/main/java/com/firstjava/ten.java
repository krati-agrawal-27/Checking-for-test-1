package com.firstjava;
import java.util.Scanner;
public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input the temp in fahrenheit");
int F= sc.nextInt();
int C=convert(F);
System.out.println("Temp in Celcius is "+ C );
	}
	static int convert(int F) {
		return ((F-32)*5)/9;
	}

}
