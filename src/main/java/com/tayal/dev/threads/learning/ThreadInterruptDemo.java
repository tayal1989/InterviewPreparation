package com.tayal.dev.threads.learning;

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		MyThreadInterruptMethod r = new MyThreadInterruptMethod();
		Thread t = new Thread(r);
		t.start();
		t.interrupt();
		
		System.out.println("End of main");
	}

}
