package com.learning.arrays;

/**
 * <h1>AdditionOfTwoNumbersInArray</h1>
 * The AdditionOfTwoNumbersInArray.java program will find out the addition pairs
 * for a given number.
 * 
 * <p>
 * For example, if we have to find combination for 10 then pairs will be
 * 1,9
 * 2,8
 * 3,7
 * 4,6
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n)
 */

public class AdditionOfTwoNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10} ;
				
		int value = 9 ;
		
		int start = 0, end = arr.length - 1 ;
		
		while(start < end){
			if((arr[start] + arr[end]) == value){
				System.out.println("Pairs are : " + arr[start] + " and " + arr[end]);
				start++;
				end--;
			} else if((arr[start] + arr[end]) < value){
				start++;
			} else{
				end--;
			}
		}
	}

}
