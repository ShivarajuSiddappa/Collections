package com.collections.arraylist;

import java.util.Arrays;

public class PatternsStarAndNumber {
	
	
	/**
	 *   output 
	 *   		* 
				* * 
				* * * 
				* * * * 
				* * * * * 
	 */
	public static void start1To5(){
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	/*Output
	 * 	 1
		 2 2
		 3 3 3
		 4 4 4 4
		 5 5 5 5 5
	 */
	
public static void start1To5Number(){
		
		for (int i = 1; i < 6; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(" "+i);
			}
			System.out.println("");
		}
	}
	
/*
 * output 
 * 	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 

 */
	public static void printNums(int n) {

		int i, j, num = 1;

		// outer loop to handle number of rows
		// n in this case
		System.out.println("Raju");
		for (i = 0; i < n; i++) {

			// without re assigning num
			// num = 1;
			for (j = 0; j <= i; j++) {
				// printing num with a space
				System.out.print(num + " ");

				// incrementing num at each column
				num = num + 1;
			}

			// ending line after each row
			System.out.println();
		}
	}

	/**
	 * Output
	 * 	*

		**
		
		***
		
		****
		
		*****
	 */
	public static void print5To1Start() {
		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	
	/**
	*Output         *
				   ***
				  *****
				 *******
				*********
	 */
	public static void traingle() {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void reverseTraingle() {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			System.out.println("Working");
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String a[]){
		/*start1To5();
		start1To5Number();
		printNums(5);
		traingle();*/
		reverseTraingle();
	}
}
