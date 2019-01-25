package com.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberInList {
	
	 public int findDuplicateNumber(List<Integer> numbers){
         
	        int highestNumber = numbers.size() - 1;
	        System.out.println("Highest No:"+highestNumber);
	        int total = getSum(numbers);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	     
	    public int getSum(List<Integer> numbers){
	         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }  
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<30;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(32);
	        numbers.add(23);
	        DuplicateNumberInList dn = new DuplicateNumberInList();
	        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	    
	}

}
