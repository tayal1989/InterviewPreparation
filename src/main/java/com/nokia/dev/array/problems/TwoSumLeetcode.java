package com.nokia.dev.array.problems;

public class TwoSumLeetcode {

	public static void main(String[] args) {
		//int[] arr = {2,7,11,15} ;
		int[] arr = {3, 2, 4} ;
		int[] targetArr = new int[2] ;
		int target = 6 ;
		
		int i = 0 , j = i + 1 ;
		
		while(i < arr.length - 1) {
			if(arr[i] + arr[j] == target) {
				targetArr[0] = i ;
				targetArr[1] = j ;
				break ;
			} else {
				j++ ;
				if(j == arr.length) {
					i = i + 1 ;
					j = i + 1 ;
				}
			}
		}
		
		System.out.println(targetArr[0]);
		System.out.println(targetArr[1]);

	}

}
