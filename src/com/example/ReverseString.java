package com.example;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "website";
		int len=name.length();
	//	System.out.println(len);
		for(int i = len-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
