package com.nokia.dev.array.problems;

/**
 * <h1>SmallerNoInTwoArray</h1>
 * The SmallerNoInTwoArray.java program will compare the first index elements of two array
 * 
 * <p>
 * For example : <br>
 * arr1 = {5, 7, 9} ; <br>
 * arr2 = {2, 4, 6, 8, 10} ;	<br>
 *	will give the number as 2
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		12-Jan-2016
 * @category O(1)
 */

public class SmallerNoInTwoArray {

	/**
	 * TODO
	 * @param args
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {5, 7, 9} ;
		int[] arr2 = {2, 4, 6, 8, 10} ;
		
		if(arr1[0] < arr2[0]) {
			System.out.println("Smallest no is : " + arr1[0]);
		} else {
			System.out.println("Smallest no is : " + arr2[0]);
		}
	}
}
