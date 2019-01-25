package com.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListImplRealtime {

	
	private Object[] myStore;
    private int actSize = 0;
     
    public ArrayListImplRealtime(){
    	//default  array size 10    	
        myStore = new Object[10];
    }
     
    
    // to add element in array 
    public void add(Object obj){
    	//
		if (myStore.length - actSize <= myStore.length/2){
            increaseListSize();
        }
		System.out.println(actSize+" DDDD");
        myStore[actSize++] = obj;
    }
    
    // get the element  from array
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    // to get the array size
    public int size(){
        return actSize;
    }
     
    
    // increase the array size  ==> actualSize * 2 
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
    
  
    
    
     // remove the element in array
    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
    
    
    // replace the element into array
    public void replace(int index, int replaceValue ){
    	System.out.println("Actual Size"+ actSize +" Index"+index);
    	if(index<actSize){
    		
    		Object temp1=null,temp2=null;
    		temp1=myStore[index];
    		
    		myStore[index]= replaceValue;// replacing value  
    		
    		for (int i = 0; i < myStore.length; i++) {
    			
        		temp2=myStore[index+1];        		
        		temp1=temp2;
        		
        		
			}
    		System.out.println(myStore[index]=temp1 +" \nvalue replaced Index Of "+ index);
    		
    	}else{
    		throw new ArrayIndexOutOfBoundsException();	
    	}
    	
    }
    

	public static void main(String a[]){
    	ArrayListImplRealtime mal = new ArrayListImplRealtime();
   
    	mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        
     
//        for(int i=0;i<mal.size();i++){
//            System.out.print("Mal Size"+mal.get(i)+" "+mal.size());
//        }
        
        mal.add(new Integer(29));
        
        mal. replace(2,6);
        
//        System.out.println("Element at Index 5:"+mal.get(5));
//        System.out.println("List size: "+mal.size());
       System.out.println("Removing element at index 2: "+mal.remove(2));
//        for(int i=0;i<mal.size();i++){
//            System.out.print(mal.get(i)+" ");
//        }
    }
}
