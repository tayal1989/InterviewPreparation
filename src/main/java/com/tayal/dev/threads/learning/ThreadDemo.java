package com.tayal.dev.threads.learning;

class MyThread extends Thread {
	
	/**
	 * If run method is not overridden, then, it will have a blank implementation
	 */
	public void run() {
		Thread.currentThread().setName("Child Thread");
		System.out.println("This line executed by thread : " + Thread.currentThread().getName());
		for(int i = 0 ;  i < 10 ; i++) {
			System.out.println("Child Thread : " + i);
		}
	}
	
	/**
	 * Overloaded run method, but by default, run method with no arguments will execute
	 * This method can be called as a normal method only
	 */
	public void run(int r) {
		System.out.println("Overloaded run method");
	}
	
	/**
	 * If start method is used, then it will work as normal method call as we have overridden 
	 * the start method of thread and JVM will assume that we have provided best
	 * implementation of start method. New thread will not be created. It is not recommended 
	 * to override start method, otherwise, don't go for multithreading concept
	 */
	public void start() {
		super.start();	// If this line is used then it will call Thread start method
						// which internal will call run method so from here, 2 threads will
						// get executed. 1 main thread and another child thread.
		System.out.println("Start Method");
	}
}

class ThreadDemo {

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
