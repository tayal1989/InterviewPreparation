package com.nokia.dev.number.problem;

public class RodCuttingProblem {

	public static void main(String[] args) {
		
		int lengthOfRod[] = {1, 2, 3, 4, 5, 6, 7, 8} ;
		int price[] = {5, 5, 8, 9, 10, 17, 17, 20} ;
		
		int reqLength = 8 ;
		int max = price[reqLength - 1] ;
		int firstLength = price[0] ;
		int secondLength = price[1] ;
		
		for(int i = 0; i < lengthOfRod.length; i++) {
			for(int j = i + 1 ; j < lengthOfRod.length - 1 ; j++) {
				if(lengthOfRod[i] + lengthOfRod[j] == reqLength) {
					System.out.println(lengthOfRod[i] + " " + lengthOfRod[j]);
					System.out.println(price[i] + price[j]);
					if(max < price[i] + price[j]) {
						max = price[i] + price[j] ;
						firstLength = lengthOfRod[i] ;
						secondLength = lengthOfRod[j] ;
					}
				}
			}
		}
		
		System.out.println("Max Price : " + max);
		System.out.println("No are : " + firstLength + " " + secondLength);

	}

}
