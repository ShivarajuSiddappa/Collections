package com.collections.arraylist;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class ReverseStringRecursive {

	String reverse = "";

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

	static void splitNumber() {
		int num = 12345;
		String number = String.valueOf(num);
		for (int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			System.out.println("digit number: " + j);
		}
	}

	public static char middleCharacterInString(String str) {

		int len = str.length();
		int midPos = 0;
		char[] a = str.toCharArray();
		if (len % 2 == 0) {
			System.out.println("Given String we are not found Mid char");

		} else {
			midPos = (len + 1) / 2;
			System.out.println(midPos);
			System.out.println("Mid Character Of String:" + a[midPos - 1]);
		}
		return a[midPos];
	}

	// static void reverseNumber() {
	// int num = 53423, reversed = 0;
	//
	// while (num != 0) {
	// int digit = num % 10;
	// reversed = reversed * 10 + digit;
	// num = num / 10;
	// }
	//
	// System.out.println("Reversed Number: " + reversed);
	//
	// }

	static void reverseNumber2() {

		int num = 12345;

		String st = String.valueOf(num);
		char ch[] = st.toCharArray();

		for (int i = 1; i <= ch.length; i++) {

			System.out.println("Reverse Number :" + ch[ch.length - i]);

		}
	}

	static void duplicateChar() {
		String str = "shivaraju";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {

					System.out.println("Duplicate char" + ch[i]);
				}
			}
		}
	}

	// duplicate number in array
	static void duplicateNumberInarray() {
		int arr[] = { 2, 3, 2, 5, 3, 4, 1, 1 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Number" + arr[i]);
				}
			}

		}
	}
	// common elements in two array

	static void commonElements() {
		String arr1[] = { "one", "two", "four", "three" };
		String arr2[] = { "one", "six", "two", "seven" };
		HashSet<String> hashset = new HashSet<String>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i].equals(arr2[j])) {
					hashset.add(arr1[i]); // reatainAll(
					System.out.println(" Common Elemetns are :" + hashset);
				}

			}

		}
	}	
	// find the maximum number in array

	static void findMaximumNumber() {
		int maxOne = 0, maxTwo = 0;

		int arr[] = { 4, 11, 17, 13, 9, 20 };

		for (int i = 0; i < arr.length; i++) {
			if (maxOne < arr[i]) {
				maxTwo = maxOne;
				maxOne = arr[i];

			} else if (maxTwo < arr[i]) {
				maxTwo = arr[i];

			}

		}
		System.out.println(" Maximum number:" + maxOne + " " + maxTwo);
	}

	
	// sort array with ascending order

	static void sortingArray() {
		int array[] = { 4, 1, 7, 3, 9, 2 };
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		 
		// After sorting printing
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Sorted array" + array[i]);
		}
	}
	// count duplicate numbers in array


	// sort array with decending order

	// Star & Number Patterns programs

	// Remove Duplicate from array // use set

	// swapping two number

	static void swapping() {
		int x = 10, y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(" Swapped number :" + x + "" + y);
	}

	public static void main(String a[]) {
		ReverseStringRecursive srr = new ReverseStringRecursive();
		System.out.println("Result: " + srr.reverseString("Java2novice"));

		/*
		 * middleCharacterInString("balaj"); reverseNumber(); duplicateChar();
		 * splitNumber(); reverseNumber2();
		 */
		sortingArray();
		commonElements();
		findMaximumNumber();
	}

}
