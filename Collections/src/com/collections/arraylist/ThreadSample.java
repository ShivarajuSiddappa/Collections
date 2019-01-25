package com.collections.arraylist;





class Printer1 extends   ThreadSample implements Runnable{
	
	public void run(){
		System.out.println("Printer 1 running");
		for(int i=0;i<9;i++){
			System.out.println(""+i);
			/*try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	
	}
	
}

class Printer2 extends Thread{
	public void run(){
		System.out.println("Printer 2 running");
	}
	
}

public class ThreadSample extends Thread {

	
	public static void main(String a[]){
		ThreadSample ts;
		ts= new  Printer1();
				//ts= new Printer2();
		
		System.out.println("Main is starting");
		ts.start();
		 new Printer2().start();
		//ets.start();
	}
}
