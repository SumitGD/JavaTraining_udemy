package com.example;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonaci1();
		fibonaciWithoutRecurrsion();

	}
	
	public static void fibonaciWithoutRecurrsion() {
		int n1=0,n2=1,n3;
		for(int i=0;i<=10;++i) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	
	static public void fibonaci1() {
		
		int n1=0, n2=1;
		System.out.print(n1+" "+n2);
		
		for(int i = 2; i<=10; i++) {
			int n3 = n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
	}

}
