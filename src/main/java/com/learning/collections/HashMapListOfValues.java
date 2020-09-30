package com.learning.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapListOfValues {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		map.put("a", list1);
		map.put("b", list2);
		
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<Integer> value = entry.getValue();
		    for(Integer aString : value){
		        System.out.println("key : " + key + " value : " + aString);
		    }
		}
	}

}
