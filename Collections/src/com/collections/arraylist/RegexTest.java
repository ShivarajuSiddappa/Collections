package com.collections.arraylist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest  {

	  public static void main (String[] args) {
    
    
    String patternString = "^jioiot/sca/[0-9]*\\/locationinfo$";
    Pattern pattern = Pattern.compile(patternString);
    Matcher m = pattern.matcher("jioiot/sca/14332423/locationinfo");
    
    
    boolean matches = m.matches();
    if(matches){
    	System.out.println("true");
    }else{
    	System.out.println("false");
    }

    
  }

}
