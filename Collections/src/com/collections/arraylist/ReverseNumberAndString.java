package com.collections.arraylist;


public class ReverseNumberAndString {


	static String reverseString(String str) {

		char[] ch = str.toCharArray();
		String orgStr = "";
		for (int i = ch.length - 1; i >= 0; i--) {

			//System.out.println(" :" + ch[i]);
			orgStr += ch[i];
		}
		System.out.println("Reverse String: " + orgStr + " ===> Original String :" + str);
		return "";
	}

	static Long reverseNumber(Long number) {
		char[] ch = number.toString().toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.println(" Reverse Number:" + ch[i]);
		}
		return null;

	}

	public static void main(String a[]) {

		reverseString("shivaraju");
		
		 String string = "Kumble";
		 
	       System.out.println("Reverse String Result: ");
	       for(int i=1; i<=string.length() ;i++)
	       {  
	            System.out.print(string.charAt(string.length()-i)); 
	       }
	       System.out.println();
		reverseNumber(54321L);

	}
}
