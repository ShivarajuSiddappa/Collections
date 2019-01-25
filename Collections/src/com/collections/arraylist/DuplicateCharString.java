package com.collections.arraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharString {
 public static	void dupAndCount(){
		 String str = "shivaraju siddappa ";
		  HashMap <Character, Integer>charCountMap = new HashMap<Character, Integer>();
		  for (int i = 0; i < str.length(); i++) {
		   char c = str.charAt(i);
		 
		   if (charCountMap.containsKey(c)) {
		    charCountMap.put(c, charCountMap.get(c)+1 );
		   } else {
		    charCountMap.put(c, 1);
		   }
		   
		  }
		  for (Character c : charCountMap.keySet()) {
		   if (charCountMap.get(c) > 1)
		    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
		 
		  }
	}

 // emp table 1
 
 
 // address table 2
 
 // INNER Join
 // select e.name, e.id, a.street, a.pincode from emp e INNER JOIN  address a  ON e.empid= 1 AND a.addressId=1;
		 
// SELECT Orders.OrderID, Customers.CustomerName FROM Orders  INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
		 // Another method
 static  void countDupChars(String str){
	 
    //Create a HashMap 
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    //Convert the String to char array
    char[] chars = str.toCharArray();
 
    /* logic: char are inserted as keys and their count
     * as values. If map contains the char already then
     * increase the value by 1
     */
    for(Character ch:chars){
      if(map.containsKey(ch)){
    	  System.out.println(" CB"+map.get(ch));
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }
 
    //Obtaining set of keys
    Set<Character> keys = map.keySet();
 
    /* Display count of chars if it is
     * greater than 1. All duplicate chars would be 
     * having value greater than 1.
     */
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
  }
	public static void main(String a[]){
		dupAndCount();
		
		countDupChars("GLOBALLOGIC");
		
		int arr[]= {1,2,1,1,2,3,5,5,9,9};
		 String str="ashivaa";
		 
		 char ch[]=str.toCharArray();
		 
		 Arrays.sort(ch);
		 
		 for (int i = 1; i < ch.length; i++) {
			 if((ch[i-1])==ch[i]){
					
					System.out.println("Duplicate Character :"+ch[i]);
				}	
			 
		}
		 
		Arrays.sort(arr);	
		for (int i = 1; i < arr.length; i++) {
			
			
			if((arr[i-1])==arr[i]){
				
				System.out.println("Duplicate Number :"+arr[i]);
			}
		} 
	}
	
	
	
}