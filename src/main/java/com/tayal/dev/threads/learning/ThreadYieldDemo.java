package com.tayal.dev.threads.learning;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThreadYieldMethod r = new MyThreadYieldMethod();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}
