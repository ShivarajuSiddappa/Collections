package com.collections.arraylist;

public class SwapingWithTemp {

	
	public static void main(String[] a){
		  int x = 30;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	       
	        x = x+y;      
	        y = x-y;
	        x = x-y;
	        
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	}
}
