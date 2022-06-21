package com.learning.arrays;

public class MaximizeStockProfitMultiPurchase {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 6, 1, 8};
//		int[] arr = {100, 180, 260, 310, 40, 535, 695};
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int diff = 0;
		int maxDiff = 0;
		int sum = 0;
		int prev = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				diff = arr[j] - arr[i];
				if(diff < 0) {
					break;
				}
				
				if(maxDiff < diff) {
					maxDiff = diff;
				}
			}
			
//			System.out.println(maxDiff);
			if(maxDiff > prev) {
				sum = sum + maxDiff;
				prev = maxDiff;
			}
		}
		
		System.out.println("Max Profit : " + sum);
	}

}
