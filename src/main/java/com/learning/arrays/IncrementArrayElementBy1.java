package com.learning.arrays;

public class IncrementArrayElementBy1 {

	public static void main(String[] args) {
		testMethod(new int[] {1, 2, 3});
		testMethod(new int[] {1, 8, 9});
		testMethod(new int[] {1, 9, 9});
		testMethod(new int[] {9, 2, 3});
		testMethod(new int[] {9, 9, 3});
		testMethod(new int[] {9, 9, 9});
		testMethod(new int[] {9});
		testMethod(new int[] {1});
	}
	
	public static void testMethod(int[] arr) {
		int[] outputArr = null;
		boolean flag = false;
		boolean secondFlag = true;
		int count = 0;
		
		for(int i = arr.length - 1; i >= 0 ; i--) {
			if(arr[i] != 9 && (count == 0 || flag)) {
				arr[i] = arr[i] + 1;
				count++;
				flag = false;
				secondFlag = false;
			} else if(arr[i] == 9 && secondFlag) {
				arr[i] = 0;
				flag = true;
			}
		}
		
		if(flag && secondFlag) {
			outputArr = new int[arr.length + 1];
			for(int i = 0; i < outputArr.length; i++) {
				if(i == 0) {
					outputArr[i] = 1;
				} else {
					outputArr[i] = arr[i - 1];
				}
			}
		}
		
		if(flag && secondFlag) {
			for(int i = 0; i < outputArr.length ; i++) {
				System.out.print(outputArr[i] + " ");
			}
		} else {
			for(int i = 0; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
