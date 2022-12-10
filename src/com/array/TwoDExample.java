package com.array;

public class TwoDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[2][2];
		a[0][0]=123;
		a[0][1] =23;
		a[1][0] =212;
		a[1][1]=543;
		
		
		int[][] b= {{232,43,54,54},{54,545,5}};
		
		int[][] c=new int[][] {{12,3,54,523},{121,2,3,4}};

		System.out.println("A");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("B");
		
		for(int i=0; i<b.length;i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+"");
			}
			System.out.println();
		}
		
		System.out.println("C");
		for(int i=0;i<c.length;i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
	}

}
