package com.tayal.dev.threads.learning;

public class MyThreadJoinChildWaitingForMainMethod implements Runnable {
	public static Thread mt ;
	
	public void run() {
		try {
			mt.join();	// In this example, child thread calls join method on main thread object.
						// Hence, child thread has to wait until completing main thread.
						// In this case, output will be Main Thread - 10 times and then followed
						// by Child Thread - 10 times.
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Child Thread : " + i);
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	

}
