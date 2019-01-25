package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SampleArrayList {

public  static void arrayList(){
	List<String> ar=new ArrayList<String>();
	ar.add("shiva");
	ar.add("Sathish");
	ar.add("shiva");
	List<String> ar1=new ArrayList<String>();
	ar.add("Rama");
	ar.add("Ramesh");
	ar.add("Suresh");
	ar.remove(new Object());
	listIterator(ar);
	iterator(ar);
	forLoop(ar);
	sortingArray(ar);
	
	sortingTwoArray(ar, ar1);
	
	findDuplicateStringInArray(ar);
	
	commonElementsInTwoArray();
	
	
}
	
	private static void commonElementsInTwoArray() {
		
		// String []  using set
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
	        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	 
	        HashSet<String> set = new HashSet<String>();
	 
	        for (int i = 0; i < s1.length; i++)
	        {
	            for (int j = 0; j < s2.length; j++)
	            {
	                if(s1[i].equals(s2[j]))
	                {
	                    set.add(s1[i]);
	                }
	            }
	        }
	 
	        System.out.println("Common Elements in two String [] :"+set);
	        
	    // Integer [] using set
	        
	        Integer[] i1 = {1, 2, 3, 4, 5, 4};
	        
	        Integer[] i2 = {3, 4, 5, 6, 7, 4};
	 
	        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
	 
	        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
	 
	        set1.retainAll(set2);
	 
	        System.out.println("Common Elements in two Integer []"+set1); 
	        
	
}

	private static void findDuplicateStringInArray(List<String> ar) {
	
	String[] strArray={"Ram","Shiva","Ram","shiva"};	
	// Using String []
	for (int i = 0; i < strArray.length-1; i++)
		{
			for (int j = i+1; j < strArray.length; j++)
			{
				if( (strArray[i].equals(strArray[j])) && (i != j) )
				{
					System.out.println("In String Array Duplicate Element is : "+strArray[j]);
				}
			}
		}
	//Using Hash Set
	
	HashSet<String> set = new HashSet<String>();

	for (String arrayElement : strArray)
	{
		if(!set.add(arrayElement))
		{
			System.out.println("Using Hash Set Duplicate Element is : "+arrayElement);
		}
	}
		
		// using Array List
		for (int i = 0; i < ar.size()-1; i++)
		{
			for (int j = i+1; j < ar.size(); j++)
			{
				if( (ar.get(i).equals(ar.get(j))) && (i != j) )
				{
					System.out.println("In ArrayList Duplicate Element is : "+ar.get(j));
				}
			}
		}
}

	private static void sortingTwoArray(List<String> ar, List<String> ar1) {
	usingCollections(ar, ar1);
	
	usingRecursive(ar,ar1);
	
}

	private static void usingRecursive(List<String> ar, List<String> ar1) {
		
		
	}

	private static void usingCollections(List<String> ar, List<String> ar1) {
		
		ar.addAll(ar1);
		Collections.sort(ar);
		
		System.out.println("Sorting two array Collections :"+ar.toString());
		
	}

	private static void sortingArray(List<String> ar) {
	
		usingCollections(ar);
		
		usingRecursive(ar);
		
	
}

	private static void usingRecursive(List<String> ar) {
		
		
		
	}

	private static void usingCollections(List<String> ar) {
		Collections.sort(ar);
		System.out.println("Collections Sorting :"+ar.toString());
	}

	private static void listIterator(List<String> ar) {
	
		ListIterator<String> litr=ar.listIterator();
		
		while(litr.hasNext()){
			System.out.println("Forward Direction"+litr.next());
		}
		while(litr.hasPrevious()){
			System.out.println("Backward Direction"+litr.previous());
		}
	
}

	private static void forLoop(List<String> ar) {
	
	for (int i = 0; i < ar.size(); i++) {
		System.out.println("For Loop"+ ar.get(i));
		
		reverseString(ar.get(i));
	}
}

	private static void reverseString(String string) {
		
		char[] arr=string.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.println("reverse "+arr[i]);
		}
		
	}

	private static void iterator(List<String> ar) {
		Iterator<String> itr= ar.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	
}

	public static void main(String a[]){
		arrayList();
		
	}
	
	
	
}
