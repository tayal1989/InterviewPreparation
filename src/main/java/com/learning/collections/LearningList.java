package com.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearningList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
			// System.out.println(listItr.previous()); will make it infinite loop
		}
	}

}
