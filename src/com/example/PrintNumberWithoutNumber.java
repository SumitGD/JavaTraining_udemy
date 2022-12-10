package com.example;

public class PrintNumberWithoutNumber {

	public static void main(String[] args) {
		
		//way1();
		//way2();
		way3UsingAscci();

	}
	
	public static void way1() {
		String a="a";
		String b="qqqqqqqqqq";		
		for(int i=a.length(); i<=b.length()*b.length(); i++) {
			System.out.println(i);
		}
	}
	
	public static void way2() {
		int one ='A'/'A';
		String s1 ="..........";
		
		for (int i=one; i<=(s1.length())*(s1.length()); i++) {
			System.out.println(i);
		}
	}
	
	public static void way3UsingAscci() {
		int one ='A'/'A';
		
		for (int i=one; i<='d'; i++) {
			System.out.println(i);
		}
	}

}
