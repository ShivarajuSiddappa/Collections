package com.collections.arraylist;

import java.util.HashMap;

abstract class A
{
    static int i = 10;
 
    static  void method()throws IllegalAccessException
    {
        System.out.println("Static Method");
    }
}
 
class B extends A
{
static  void method(){
	System.out.println("Calling B"); 
 }
}
 

public class StaticMethodExtendInSub {
	 public static void main(String[] args){
	   HashMap<String,String>map=new HashMap<String, String>();
	   map.put("1", "shiva");
	        B.method();       //Calling inherited static method     
	   
		 
	        System.out.println(B.i);    //printing inherited static field.
	    }
}
