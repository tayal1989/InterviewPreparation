package com.tayal.dev.threads.learning;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Child Thread : " + i);
		}
	}

}
