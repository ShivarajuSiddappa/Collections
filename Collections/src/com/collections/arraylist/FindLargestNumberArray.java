package com.collections.arraylist;

public class FindLargestNumberArray {

	static void biggestNumber(int[] arr) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			if (temp <= arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println("Biggest Number" + temp);
	}

	static void smallestNumber(int[] arr) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			if (temp >= arr[i]) {
				temp = arr[i];
				System.out.println("Smallest Number :" + temp);

			} else {
				temp = arr[i];
			// System.out.println("Not A Smallest Number :" + arr[i]);
			}
		}
	
	}

	public static void main(String[] a) {

		int[] arr = { 3, 5, 10, 1, 2, 3 };
		biggestNumber(arr);
		smallestNumber(arr);

	}
}
// i=0 3>=0 yes //temp 3

// i=1 5>=3 yes // temp 5

// i=2 10>=5 yes // temp 10

// i=3 2>=10 No // temp 10

// i=4 3>=1 No //temp 10

// Now temp have 10 biggest number