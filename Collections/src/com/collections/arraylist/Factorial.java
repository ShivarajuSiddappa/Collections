package com.collections.arraylist;

public class Factorial {
	  static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
        	  n= (n * factorial(n-1));
          System.out.println(" Factorial Number : "+ n);
            return n;      
    }      
public static void main(String[] a){

	
	
	// calling method inside same the method is called recursive algorithm
	
	Factorial.factorial(5);
}
}
