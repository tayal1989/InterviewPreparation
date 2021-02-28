package com.tayal.dev.threads.learning;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();	// 2 threads will be created, 1 main thread and another child thread
		//t.run();	// only 1 thread will be created i.e. main. It will work as normal program
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Main Thread : " + i);
		}
		
		System.out.println("This line executed by thread : " + Thread.currentThread().getName());
	}

}
