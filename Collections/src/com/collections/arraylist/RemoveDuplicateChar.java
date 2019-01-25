package com.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateChar {

	private static void removeDuplicateNumber(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println(" Duplicate" + arr[j]);
				}
			}
		}

	}

	private static void remove(String value) {

		String afterRemove = null;
		char ch[] = value.toCharArray();

		List<Character> arr = new ArrayList<Character>();
		List<Character> dup = new ArrayList<Character>();

		for (int i = 0; i < ch.length; i++) {

			if (!arr.contains(ch[i])) {
				arr.add(ch[i]);
			} else {

				afterRemove = value.substring(0, i) + value.substring(i + 1);
				System.out.println(" After Remove :" + afterRemove);

				dup.add(ch[i]);
			}
		}

		System.out.println("Remaining Charactes :" + arr.toString());

		System.out.println("Duplicate Charactes :" + dup.toString());

	}

/*	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
	*/

	public static void main(String a[]) {
		String str = "Javashivaraju";
		remove(str);

		int arr[] = { 12, 2, 4, 2, 5, 7, 9, 12 };
		removeDuplicateNumber(arr);
		// System.out.println(removeCharAt(str, 3));
	}

}
