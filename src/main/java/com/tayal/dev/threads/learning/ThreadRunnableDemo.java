package com.tayal.dev.threads.learning;

public class ThreadRunnableDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}
