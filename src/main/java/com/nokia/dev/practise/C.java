package com.nokia.dev.practise;

import com.edx.exam.test.A;

public class C extends A{
	public static void main(String[] args){
		B b = new B();
		C c = new C();
		c.test();
		
		//b.foo();	//The method foo() from the type A is not visible
		//b.foo();
	}
	
	public void test() {
		super.foo();
	}
}
