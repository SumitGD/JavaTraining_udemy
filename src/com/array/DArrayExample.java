package com.array;

public class DArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		a=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println();
		for (int i:a) {
			System.out.println(i);
		}
		
		String[] a1= {"Sumit","amit","akshay"};
		String[] a2=new String[]{"abc","xyz","ijk"};
		for (int i=0; i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		for (String i:a2) {
			System.out.println(i);
		}

	}

}
