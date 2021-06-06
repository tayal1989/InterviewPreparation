package com.learning.test;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j = 0 ; j < 5 ; j++) {
			for(int k = 0 ; k < 4 - j ; k++) {
				System.out.print(" ");
			}
			
			for(int i = 0 ; i < ((2 * j) + 1) ; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
