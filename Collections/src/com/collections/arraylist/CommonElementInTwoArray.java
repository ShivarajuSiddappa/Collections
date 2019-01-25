package com.collections.arraylist;

public class CommonElementInTwoArray {

	
	static void findCommonElements(int[] arr1,int[]arr2){
		
		
		for (int i = 0; i < arr2.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]==arr2[j]){
					System.out.println(" Common  Element is :"+arr1[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] a){
		
		
		int[] arr1={10,20,30,40	,5 ,12};
		
		int[] arr2={20,50,30,60	,5 ,15};
		findCommonElements(arr1,arr2);
		
	}
}
