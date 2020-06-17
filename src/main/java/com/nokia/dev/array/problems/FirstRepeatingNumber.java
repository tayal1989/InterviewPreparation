package com.nokia.dev.array.problems;

import java.util.HashSet;

public class FirstRepeatingNumber {

	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 2, 3} ;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(set.contains(a[i])) {
				System.out.println(a[i]);
			} else {
				set.add(a[i]);
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[Math.abs(a[i]) - 1] < 0) {
				System.out.println(Math.abs(a[i]));
			} else {
				a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1] ;
			}
		}

	}

}
