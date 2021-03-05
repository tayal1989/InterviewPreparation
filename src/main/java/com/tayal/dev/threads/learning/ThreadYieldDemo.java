package com.tayal.dev.threads.learning;

class MyThreadYieldMethod implements Runnable {

	public void run() {
		Thread.currentThread().setPriority(2);
		for(int i = 0 ; i < 10 ; i++) {
			Thread.yield();
			System.out.println("Child Thread : " + i);
		}
	}

}

class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThreadYieldMethod r = new MyThreadYieldMethod();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}
