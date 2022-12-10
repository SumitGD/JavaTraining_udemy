package com.example;

import java.util.ArrayList;
import java.util.List;

public class RevereseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseNumber();
		//reverseNumber1();
		reverseNum();
	}

	public static void reverseNumber() {
		int num = 3142;
		System.out.println("the number is : " + num);
		int rem;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("the reverse number is : " + rev);
	}

	public static void reverseNumber1() {
		int number = 987654, reverse = 0;
		System.out.println("The given number is: " + number);
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

	public static void reverseString() {
		String s1 = "Sumit";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}

	public static void reverseString2() {
		String str = "Sumit";
		System.out.print(str.charAt(4));
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void reverseNum() {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
	}

	public static void reverseString1() {
		String name = "Sumit";
		int leng = name.length();
		System.out.println("the length is : " + leng);
		for (int i = leng; i <= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}

}
