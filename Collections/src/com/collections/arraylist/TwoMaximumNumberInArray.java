package com.collections.arraylist;

public class TwoMaximumNumberInArray {

	
	static void findTwoMaximum(int[] arr1){
		
		
		int maxOne = 0 , maxTwo= 0;
		
		for (int i = 1; i <= arr1.length; i++) {
			
			if(maxOne<arr1[i]){
				maxTwo=maxOne;
				maxOne = arr1[i];
				// first MAXONE == 10
				
				// second MAXONE == 20
				// 3rd MAXONE == 30

				// fail condition
				
			}else if(maxTwo<arr1[i]){
				
				// 4th
				
				//MAXTWO == 20
				maxTwo= arr1[i];
				
			}
		}
		System.out.println("Max One : " + maxOne + "\nMax Two :"+ maxTwo);
		
	}
	
	
	
	
	public static void main(String[] a){
		// length 6
	int arr1[]={10,20,30,5,10,3};
	
	// a[1]==>10
	// a[2]==>20
	// a[3]==>30
	// a[4]==>5
	// a[5]==>10
	// a[6]==>3
	findTwoMaximum(arr1);
	
	}
	
}
