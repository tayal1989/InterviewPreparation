package com.learning.arrays;

import java.util.Arrays;

/**
 * <h1>RemoveDuplicate</h1>
 * The RemoveDuplicate.java program will remove the duplicate elements from the array.
 * Logic is sort the array and find the consecutive elements are duplicate or not
 * 
 * <p>
 * For example : <br>
 * input1 = {21, 10, 24, 2, 21} ;	<br>
 *	will give the output as <br>
 * 2 10 21 24 <br>
 * Unique elements are : 4
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n)
 */

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21, 10, 24, 2, 21} ;
		
		int count = 0 ;
		
		Arrays.sort(arr);
		
		System.out.println("Sorted array : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i <= arr.length ; i++){
			if(i >= arr.length) {
				break ;
			}
			
			if(i == arr.length - 1 && arr[i] != arr[i - 1]) {
				System.out.print(arr[i]) ;
				count++ ;
				break ;
			}else if(arr[i] == arr[i + 1]) {
				i = i + 1 ;
			} else {
				System.out.print(arr[i] + " ");
				count++ ;
			}		
			
		}
		
		System.out.println("\nUnique elements are : " + (count));
	}

}
