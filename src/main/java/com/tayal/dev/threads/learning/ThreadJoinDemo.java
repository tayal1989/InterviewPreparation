package com.tayal.dev.threads.learning;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJoinMethod r = new MyThreadJoinMethod();
		Thread t = new Thread(r);
		t.start();
		
		//t.join();	//As this flow belongs to main thread therefore 
					//Main Thread will wait for child thread completion
		t.join(10000);
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Ram Thread");
		}
	}

}
