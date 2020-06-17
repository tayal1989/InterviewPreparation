package com.nokia.dev.array.problems;

import java.util.HashMap;

public class FirstUniqueNumber {

	public static void main(String[] args) {

		int[] a = {1, 1, 2, 3, 4, 2, 3} ;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(hmap.get(a[i]) != null) {
				hmap.put(a[i], hmap.get(a[i]) + 1) ;
			} else {
				hmap.put(a[i], 1) ;
			}
		}
		
		for(Integer key : hmap.keySet()) {
			if(hmap.get(key) == 1) {
				System.out.println("Unique Element : " + key);
			}
		}

	}

}
