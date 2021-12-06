package com.learning.arrays;

/**
 * @author Vishal Agarwal
 * @version Creation time: 23-Nov-2021 6:06:47 pm
 * @classDescription
*/

public class LargestAtRightSide {

	public static void main(String[] args) {
		int []arr = {3, 4, 2, 12, 3, 1};
		int []out = new int[arr.length];
		int k = 0;
		if(arr.length != 0) {
			for(int i = 0 ; i < arr.length ; i++) {
				int maxElement = 0;
				for(int j = i + 1 ; j < arr.length ; j++) {
					if(maxElement < arr[j]) {
						maxElement = arr[j]; 
					}
				}
				out[k] = maxElement;
				k++;
			}
			
			for(int i = 0 ; i < out.length ; i++) {
				System.out.print(out[i] + " ");
			}
		}
	}

}
