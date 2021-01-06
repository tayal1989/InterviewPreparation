package com.nokia.dev.array.problems;

public class BestTimeToBuyStock {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
//		int[] prices = {1, 2};
		
		if(prices.length <= 1) {
			System.exit(0);
		}
		
		System.out.println(longApproach(prices));
		System.out.println(efficientApproach(prices));
	}
	
	public static int longApproach(int[] prices) {		
		int[] outputArr = new int[prices.length - 1];
		int diff = 0 ;
		int maxDiff = 0 ;
		
		for(int i = 0 ; i < prices.length - 1 ; i++) {
			for(int j = i + 1 ; j < prices.length; j++) {
				diff = prices[j] - prices[i] ;
				if(diff > maxDiff) {
					maxDiff = diff ;
				}
			}
			
			if(maxDiff <= 0) {
				outputArr[i] = 0 ;
			} else {
				outputArr[i] = maxDiff ;
			}
			
			maxDiff = 0 ;
		}
		
		int maxProfit = 0 ;
		
		for(int i = 0 ; i < outputArr.length ; i++) {
			if(maxProfit < outputArr[i]) {
				maxProfit = outputArr[i] ;
			}
		}

		return maxProfit;
	}
	
	public static int efficientApproach(int[] prices) {
		int minProfit = prices[0] ;
		int cost = 0 ;
		int maxProfit = 0 ;
		
		for(int i = 0 ; i < prices.length ; i++) {
			minProfit = Math.min(minProfit, prices[i]) ;
			cost = prices[i] - minProfit ;
			maxProfit = Math.max(maxProfit, cost) ;
		}
		
		return maxProfit ;
	}

}
