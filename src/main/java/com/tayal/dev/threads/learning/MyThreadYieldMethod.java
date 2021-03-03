package com.tayal.dev.threads.learning;

public class MyThreadYieldMethod implements Runnable {

	public void run() {
		Thread.currentThread().setPriority(2);
		for(int i = 0 ; i < 10 ; i++) {
			Thread.yield();
			System.out.println("Child Thread : " + i);
		}
	}

}
