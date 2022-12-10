package com.example;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonaci();
		swapNumber();

	}
	public static void fibonaci() {
		int n1=0, n2=1, count=10;
		for (int i = 0; i<=count; i++) {
			int fibo=n1+n2;
			System.out.print(" "+fibo);
			n1=n2;
			n2=fibo;
		}
	}
	
	public static void swapNumber() {
		int n1=32;
		int n2=76;
		System.out.println(" "+n1+" "+n2);
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(" "+n1+" "+n2);
	}

}
