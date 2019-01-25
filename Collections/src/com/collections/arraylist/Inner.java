package com.collections.arraylist;


class A1 {
	public void disp()throws ArithmeticException,Exception{
		System.out.println("A1");
	}
}

class B1 extends A1{
	public void disp()  {
		System.out.println("B1");
	}
}
public class Inner {


	public static void main(String[] a) throws ArithmeticException, Exception{
		A1
		b=  new B1();
		b.disp();
	}
	
}
