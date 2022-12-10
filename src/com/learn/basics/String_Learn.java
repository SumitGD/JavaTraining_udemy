package com.learn.basics;

public class String_Learn {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		// String is an  object 
		
		//String literal
		String a = "Sumit dhanawade";
		
		//new
		String b = new String();
		b="This String with new keyword";
		String c = new String("initialize value ");
		
		System.out.println(a+b+c);
		
		// Reverse a string
		for (int i=c.length()-1; i>=0; i--) {
			System.out.println(c.charAt(i));
		}
		
		

	}

}
