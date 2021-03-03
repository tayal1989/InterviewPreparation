package com.tayal.dev.threads.learning;

public class ThreadJoinChildWaitingForMainMethodDemo {

	public static void main(String[] args) {
		MyThreadJoinChildWaitingForMainMethod.mt = Thread.currentThread();
		
		MyThreadJoinChildWaitingForMainMethod r = new MyThreadJoinChildWaitingForMainMethod();
		Thread t = new Thread(r);
		t.start();
		
		/*
		 * If main thread calls join method on child thread object and child thread
		 * calls join method on main thread object then both threads will wait forever
		 * and the program will be stucked/paused(this is something like deadlock).
		 */
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		try {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
