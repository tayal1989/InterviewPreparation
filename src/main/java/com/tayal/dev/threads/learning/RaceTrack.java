package com.tayal.dev.threads.learning;

/**
 * <h1>RaceTrack.java</h1>
 * The RaceTrack.java program implements an application that
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

public class RaceTrack implements Runnable {

		public static String winner ;
		
		public void distanceCovered() {
			for(int dist = 1 ; dist <= 10 ; dist++) {
				System.out.println("Distance covered by : " + Thread.currentThread().getName() + " is " + dist + " meters");
				/*boolean isRaceComplete = */isRaceWon(dist) ;
				
				/*if(isRaceComplete) {
					break ;
				}*/			
			}			
		}

		private boolean isRaceWon(int distCovered) {
			boolean isRaceOver = false ;
			
			if(RaceTrack.winner == null && distCovered == 10) {
				RaceTrack.winner = Thread.currentThread().getName();
				System.out.println("Winner is : " + RaceTrack.winner);
				isRaceOver = true ;
			} else if (RaceTrack.winner == null) {
				isRaceOver = false ;
			} else if (RaceTrack.winner != null ) {
				isRaceOver = true ;
			}
			return isRaceOver;
		}

		public void run() {
			// TODO Auto-generated method stub
			this.distanceCovered();
		}
}
