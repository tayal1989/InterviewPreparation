package com.nokia.dev.array.problems;

/**
 * <h1>FindDuplicateNumberInArray</h1>
 * The FindDuplicateNumberInArray.java program will find all duplicate numbers
 * present in array.
 * 
 * <p>
 * For example : <br>
 * input1 = {6, 8, 9, 1, 8, 5, 9, 7, 2, 2} ;	<br>
 *	will give the duplicate elements as 8, 9 and 2
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {2, 8, 9, 1, 4, 5, 10, 3, 6, 7} ;
		int[] arr = {6, 8, 9, 1, 8, 5, 9, 7, 2, 2} ;
		
		int i = 0 , j = i + 1 ;
		
		while(i < arr.length - 1) {
			if(arr[i] == arr[j]){
				System.out.println("Duplicate element : " + arr[i]);
				i++ ;
				j = i + 1 ;
			} else {
				j++ ;
				if(j == arr.length) {
					i++ ;
					j = i + 1 ;
				}
			}
		}
		
	}

}
