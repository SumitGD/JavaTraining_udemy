package com.learn.StringMethod;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charAtMethods();
		allStringMethods();
	}

	/**
	 * 1. char charAt(int index) - It returns char value for the particular index
	 * 2. int length() - It returns string length. 
	 */

	public static void charAtMethods() {
		String a="Sumit Dhanawade";
		System.out.println(a);
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(6));
		int num=(a.length())-1;
		System.out.println(num);


		for (int i=num; i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	} 

	/**
	 * 1. String substring(int beginIndex)	- It returns substring for given begin index.
	 * 2. String substring(int beginIndex, int endIndex) - It returns substring for given begin index and end index.
	 */
	public static void allStringMethods() {
		String str="Sumit Dhanawade";
		String str1="SumitDhanawade";
		String str2="mit";
		
		System.out.println("++++Substring++++");
		System.out.println(str.substring(3));	
		System.out.println(str.substring(2, 5));
		
		System.out.println("+++chars+++");
		System.out.println(str.chars());
		System.out.println(	str.toString());
		
		System.out.println("+++Code Point+++");
		System.out.println(str.codePointAt(6));
		System.out.println(str.codePointBefore(5));
		System.out.println(str.codePointCount(3, 5));
		System.out.println(str.codePoints());
		
		System.out.println("+++Compare+++");
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		
		System.out.println("++concat+++");
		System.out.println(str.concat(str1));
		
		System.out.println(str.contains(str2));
		System.out.println(str.contentEquals(str2));
		//System.out.println(str.contentEquals(null));
		System.out.println(str.endsWith(str2));
	
		System.out.println();
		System.out.println();

	}
}
