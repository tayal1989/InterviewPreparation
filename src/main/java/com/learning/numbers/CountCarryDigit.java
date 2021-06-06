package com.learning.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountCarryDigit {

	public static void main(String[] args) {
		System.out.println(carryDigit(1234, 5678));
	}
	
	
	public static int carryDigit(int no1, int no2) {
		int count = 0 ;
		int len = 0 ;
		int sum = 0 ;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1 = getList(no1);
		list2 = getList(no2);
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		if(list1.size() > list2.size()) {
			len = list1.size();
			list2.add(0, 0);
		} else if(list2.size() > list1.size()) {
			len = list2.size();
			list1.add(0, 0);
		} else {
			len = list1.size();
		}
		
		for(int i = len - 1 ; i >= 0 ; i--) {
			sum = list1.get(i) + list2.get(i) + sum;
			if(sum >= 10) {
				sum = sum / 10 ;
				count = count + 1 ;
			} else {
				sum = 0 ;
			}
		}
		
		return count;
	}
	
	public static List<Integer> getList(int no) {
		List<Integer> list = new ArrayList<Integer>();
		int rem = 0 ;
		
		while(no != 0) {
			rem = no % 10 ;
			no = no / 10 ;
			list.add(rem);
		}
		
		return list;
	}

}
