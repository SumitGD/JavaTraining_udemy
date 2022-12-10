package com.array;

public class ThreeD_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a= {{{12,43,53},{34,34},{453,5,45,45,45}},{{1},{2,2,2,}},{{1},{2,2,2,}}};
		System.out.println("length of an array"+a.length);
		
		//Retrive 3D Array
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i][j].length; k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}
