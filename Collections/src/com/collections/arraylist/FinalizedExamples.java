package com.collections.arraylist;

public class FinalizedExamples {

	public void finalize(){
		System.out.println("Calling..........");
	}
	
	public static void main(String a[]){
	
	FinalizedExamples f = new FinalizedExamples();
	FinalizedExamples f1 = new FinalizedExamples();
	f=null;
	f1=null;
	System.gc();
		
	}
	
	
}
