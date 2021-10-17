package com.learning.designpatterns;

/**
 * @author Vishal Agarwal
 * @version Creation time: 17-Oct-2021 5:44:28 pm
 * @classDescription
*/

public class DesignPattern {

	public static void main(String[] args) {
		// User 1
		System.out.println("User 1 Accessing Cloud resource for first time");
		SingletonClass singletonClass = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonClass.hashCode());
		
		// User 2
		System.out.println("User 2 Accessing Cloud resource for second time");
		SingletonClass singletonClass2 = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonClass2.hashCode());
				
		// User 3
		System.out.println("User 3 Accessing Cloud resource for third time");
		SingletonClass singletonClass3 = SingletonClass.getSharedInstance();
		System.out.println("Hashcode for shared cloud user 1 : " + singletonClass3.hashCode());
	}

}