package com.learning.arrays;

public class MaximizeStockProfitSinglePurchase {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 6, 1, 8};
//		int[] arr = {100, 180, 260, 310, 40, 535, 695};
		int diff = 0;
		int maxDiff = 0;
		int cp = 0;
		int sp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				diff = arr[j] - arr[i];
				if(maxDiff < diff) {
					maxDiff = diff;
					cp = arr[i];
					sp = arr[j];
				}
			}
		}
		
		System.out.println("Max Profit : " + maxDiff);
		System.out.println("Broker should buy at : " + cp);
		System.out.println("Broker should sell at : " + sp);
	}

}
