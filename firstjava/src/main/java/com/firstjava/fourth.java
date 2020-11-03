package com.firstjava;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x[]= new int[7];
  x[0]=1;
  x[1]=1;
  for(int i=2;i<7;i++) {
	  x[i]=x[i-1]+x[i-2];
  }
  for(int i=0;i<7;i++) {
	  System.out.print(x[i]+" ");
  }
	}

}
