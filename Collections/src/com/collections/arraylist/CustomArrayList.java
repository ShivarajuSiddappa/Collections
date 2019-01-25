package com.collections.arraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class CustomArrayList {

	private Object[] myObject;

	private static final int DEFAULT_CAPACITY = 10;

	private int sizeOfArray = 0;

	private CustomArrayList() {

		myObject = new Object[DEFAULT_CAPACITY];

	}

	public void addNewElement(Object obj) {

		if (sizeOfArray == myObject.length) {
			increaseArraySize();
		} else {
			myObject[sizeOfArray++] = obj;
		}
	}

	private void increaseArraySize() {
		int newSize = myObject.length * 2;
		myObject = Arrays.copyOf(myObject, newSize);

	}

	public Object remove(int index) {

		System.out.println("Size " + sizeOfArray + " index:" + index);
		if (index < sizeOfArray) {
			Object obj = myObject[index];
			myObject[index] = null;
			for (int i = 0; i < myObject.length; i++) {
				if (myObject[index + 1] != null) {
					myObject[index] = myObject[index + 1];
					myObject[index + 1] = null;
					/*index++;*/
				} 

			}
			sizeOfArray--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	public int size() {
		return sizeOfArray;
	}

	public Object get(int index) {
		if (myObject[index] == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return myObject[index];
	}

	public static void main(String st[]) {

		HashMap<String, String> h= new HashMap<String,String>();

		Vector<Integer> v = new Vector<>();

//Implemented Methods
//=======================
// add(Object o);
// add(int index,Object o);
// addFirst(Object o)
// addLast(Object o)

//removeLast();
//removeFirst();
// remove(int index);
// remove(Object o);

//size()
//contains(Object o);
// pop() remove elements & retrieves first element in list

//set(int index , Object o)// replace elements value on bases on index


//Object get(int index)
//object getLast();
//Object getFirst();

//peek(), peekFirst(), peekLast()
//poll(),pollFirst(),pollLast()
// push()

		CustomArrayList ca = new CustomArrayList();
		ca.addNewElement(10);
		ca.addNewElement(15);
		ca.addNewElement(16);
		ca.addNewElement(17);
		ca.addNewElement(19);
		ca.addNewElement(25);
		ca.addNewElement(11);
		ca.addNewElement(12);
		
		ca.remove(5);

		for (int i = 0; i < ca.size(); i++) {

			System.out.println(" Size" + ca.size());
			System.out.println("Object" + ca.get(i));
		}

	}
}
