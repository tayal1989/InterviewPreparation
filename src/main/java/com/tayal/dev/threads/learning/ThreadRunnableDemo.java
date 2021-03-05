package com.tayal.dev.threads.learning;

class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Child Thread : " + i);
		}
	}

}

class ThreadRunnableDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.setPriority(10);
		t.start();
		
		System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

}
