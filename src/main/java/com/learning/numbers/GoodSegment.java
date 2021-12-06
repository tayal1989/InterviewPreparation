package com.learning.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vishal Agarwal
 * @version Creation time: 28-Nov-2021 8:46:50 pm
 * @classDescription
*/

public class GoodSegment {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		list.add(37);
//		list.add(7);
//		list.add(22);
//		list.add(15);
//		list.add(49);
//		list.add(60);
//		int lower = 3;
//		int upper = 48;
		
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(15);
		int lower = 1;
		int upper = 10;
//		System.out.println(list);
		Collections.sort(list);
//		System.out.println(list);
		
		System.out.println(goodSegment(list, lower, upper));
	}
	
	public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {
		int longestSegment = 0;
		List<Integer> listOfSegment = new ArrayList<Integer>();
		for(int i = 0 ; i < badNumbers.size() ; i++) {
			longestSegment = 0;
			int lowNumber = 0;
			int largeNumber = 0;
			if(i == 0 && upper > badNumbers.get(i)) {
				lowNumber = badNumbers.get(i) - 1;
				longestSegment = lowNumber - lower + 1;
//				System.out.println(longestSegment);
				listOfSegment.add(longestSegment);
			} else if(i != 0 && upper > badNumbers.get(i)){
				lowNumber = badNumbers.get(i - 1) + 1;
				largeNumber = badNumbers.get(i) - 1;
				longestSegment = largeNumber - lowNumber + 1;
//				System.out.println(longestSegment);
				listOfSegment.add(longestSegment);
			} else if(i != 0 && upper < badNumbers.get(i) && upper > badNumbers.get(i - 1)) {
				lowNumber = badNumbers.get(i - 1) + 1;
				longestSegment = upper - lowNumber + 1;
//				System.out.println(longestSegment);
				listOfSegment.add(longestSegment);
			}
		}
		
		if(badNumbers.size() == 1) {
			int lowNumber = badNumbers.get(0) + 1;
			longestSegment = upper - lowNumber + 1;
			listOfSegment.add(longestSegment);
		}
		
		Collections.sort(listOfSegment);
//		System.out.println(listOfSegment.get(listOfSegment.size() - 1));
		longestSegment = listOfSegment.get(listOfSegment.size() - 1);
		return longestSegment;
	}

}
