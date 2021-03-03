package com.tayal.dev.threads.learning;

public class MyThreadInterruptMethod implements Runnable {

	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
			System.out.println("Child Thread got interrupted");
		}
	}

}
