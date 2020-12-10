package com.nokia.dev.array.problems;

public class MirrorImage {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 15} ;
		int sum = 0 ;
		int remainder = 0 ;
		int number = 0 ;
		
		for(int i = arr.length - 1; i >= 0 ; i--) {
			sum = 0 ;
			remainder = 0 ;
			number = arr[i] ;
			
			while(number != 0) {
				remainder = number % 10 ;
				number = number / 10 ;
				sum = sum * 10 + remainder ;
			}
			
			arr[i] = sum ;
		}
		
		for(int i = 0 ; i < arr.length / 2 ; i++) {
			int temp = arr[i] ;
			arr[i] = arr[arr.length - 1 - i] ;
			arr[arr.length - 1 - i] = temp ;
		}
		
		for(int ind = 0 ; ind < arr.length ; ind++) {
			if(ind != arr.length - 1) {
				System.out.print(arr[ind] + " ");
			} else {
				System.out.print(arr[ind]);
			}
		}

	}

}
