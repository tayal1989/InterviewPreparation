package com.learning.threads;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread 1 starts execution of d1() method");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Thread 1 trying to call B's last() method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside class A, last() method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread 2 starts execution of d2() method");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Thread 2 trying to call A's last() method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside class B, last() method");
	}
}

class ThreadDeadlockDemo extends Thread {
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b);	// Executed by main thread
	}
	
	public void run() {
		b.d2(a);	// Executed by child thread as child thread is responsible to execute run method
	}

	public static void main(String[] args) {
		ThreadDeadlockDemo t = new ThreadDeadlockDemo();
		t.m1();
	}
}
