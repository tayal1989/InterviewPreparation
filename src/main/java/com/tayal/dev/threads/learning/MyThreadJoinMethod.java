package com.tayal.dev.threads.learning;

public class MyThreadJoinMethod implements Runnable {

	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Sita Thread");
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
