package com.tayal.dev.threads.learning;

class Display {
		public synchronized void wish(String name) {
			try {
				for(int i = 0 ; i < 5 ; i++) {
					System.out.print("Good Morning : ");
					Thread.sleep(1000);
					System.out.println(name);
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
}

class MyThreadSynchronizedMethod implements Runnable {
	
	Display d ;
	String name ;
	
	public MyThreadSynchronizedMethod(Display d, String name) {
		this.d = d ;
		this.name = name ;
	}

	public void run() {
		d.wish(name);
	}

}

class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		
		MyThreadSynchronizedMethod r1 = new MyThreadSynchronizedMethod(d1, "Vishal");
		MyThreadSynchronizedMethod r2 = new MyThreadSynchronizedMethod(d1, "Naina");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
