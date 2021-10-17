package com.learning.designpatterns;

/**
 * @author Vishal Agarwal
 * @version Creation time: 17-Oct-2021 5:41:21 pm
 * @classDescription To explain Singleton Design pattern
*/

public class SingletonClass {
	private SingletonClass() {
		
	}
	
	private static SingletonClass sharedInstance = null ;
	
	public static SingletonClass getSharedInstance() {
		if(sharedInstance == null) {
			return sharedInstance = new SingletonClass();
		}
		
		return sharedInstance;
	}
}
