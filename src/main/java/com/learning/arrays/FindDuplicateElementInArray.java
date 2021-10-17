package com.learning.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vishal Agarwal
 * @version Creation time: 03-Sep-2021 2:07:44 pm
 * @classDescription
*/

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 8, 2, 3, 1} ;
		Set<Integer> uniqueElements = new HashSet<Integer>();
		Set<Integer> duplicatedElements = new HashSet<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(uniqueElements.contains(arr[i])) {
				duplicatedElements.add(arr[i]) ;
			} else {
				uniqueElements.add(arr[i]) ;
			}
		}
		
		System.out.println("Unique Elements are : " + uniqueElements);
		System.out.println("Duplicated Elements are : " + duplicatedElements);
	}

}
