package com.edx.exam.test;

public class PolyMorphism {
	
	public static int add(int a, int b) {
		return a + b ;
	}
	
	public static double add(double a, double b) {
		return a + b ;
	}

	public static final strictfp synchronized void main(String... args) {
		System.out.println(add(1, 5));
		System.out.println(add(1.0, 5.0));
	}

}
