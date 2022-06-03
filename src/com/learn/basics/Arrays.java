package com.learn.basics;

import java.lang.reflect.Array;

import javax.swing.text.ZoneView;

public class Arrays {
	public static void main(String[] args) {

		/**
		 * @topic : Array 
		 * It is an object or collection of similar data type element
		 * used to store similar multiple types of values.
		 *  Syntax to create a variable: data_type variable_name = value ;
		 how to declare array and how to access arrays
		 what is an array - array is an object used to store multiple values in it,
		 why to use array - it can store mutilpe values
		 how to declare array and how to access arrays
		 * 		 
		 * */

		// declare array
		/**
		 *Declare array :  multiple ways to declare arry 
		 *1. Data_type[] array_name = new data_type[size_of_array];
		 *   initilize value :  array_name[0] = value;
		 * */
		String[] array1 = new String[3];
		array1[0]="first array";
		array1[1]="sec array ";
		array1[2]="third array";

		System.out.println("print first element of array1 "+ array1[0]);
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}


		/**
		 * 2. data_type[] array_name = {value1, value2,....n};
		 * */
		int [] arr2 = {12,32,32,3,2};
		String[] stringArry = {"Sumit", "learning ", "java"};
		System.out.println(stringArry[2]);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}





	}

}
