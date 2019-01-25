package com.collections.arraylist;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingArrayToAscending {

	static void sortStringArray(){
		
		
	      SortedSet<String> set = new TreeSet<String>();

	      String[] s= {"this", "will", "be", "sorted", "without", "any", "sort()", "function", "or", "comparator"};



	      // Add elements to the set

	      for(int i=0; i<s.length; i++)

	      {

	    	  set.add(s[i]);

	      }
	      // Iterating over the elements in the set

	      Iterator<String> it = set.iterator();

	      while (it.hasNext()) {

	         // Get element

	         Object element = it.next();

	         System.out.println(element.toString());

	      }

	   }
	
	public static void main(String[] arrrgs) {
		int  temp;
		
		int arr[] = {2,5,6,1,3};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					System.out.println(" arr[i] :"+arr[i] + " arr[j]" + arr[j]);
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("arrscending Order:");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[arr.length - 1]);
	}
}
