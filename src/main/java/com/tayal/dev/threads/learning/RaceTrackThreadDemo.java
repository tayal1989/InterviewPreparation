package com.tayal.dev.threads.learning;

/**
 * <h1>RaceTrackThreadDemo.java</h1>
 * The RaceTrackThreadDemo.java program implements an application that
 * 
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		26-Sep-2016
 */

public class RaceTrackThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RaceTrack rt = new RaceTrack() ;
		
		Thread t1 = new Thread(rt, "A1") ;
		Thread t2 = new Thread(rt, "A2") ;
		Thread t3 = new Thread(rt, "A3") ;
		
		t1.start();
		t2.start();
		t3.start();
	}

}
