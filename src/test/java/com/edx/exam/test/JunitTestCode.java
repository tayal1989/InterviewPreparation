package com.edx.exam.test;

import junit.framework.TestCase;

public class JunitTestCode extends TestCase {

	public static void testAdd() {
		int actual = JunitMainCode.add(4,5);	//9
		assertEquals(9, actual);
	}
	
	public static void testSubtract() {
		int actual = JunitMainCode.subtract(3,2);	//1
		assertEquals(3, actual);
	}
}
