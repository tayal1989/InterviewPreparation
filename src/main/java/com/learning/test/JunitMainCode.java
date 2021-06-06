package com.learning.test;

public class JunitMainCode {

	public static void main(String[] args) {
		System.out.println(add(4,5));	//9
		System.out.println(subtract(5,3));	//2
	}
	
	public static int add(int a, int b) {
		return a + b ;
	}
	
	public static int subtract(int a, int b) {
		return a - b ;
	}

}
