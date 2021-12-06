package com.learning.practise;

/**
 * @author Vishal Agarwal
 * @version Creation time: 23-Nov-2021 6:47:31 pm
 * @classDescription
*/

public class ExtractShape {

	public static void main(String[] args) {
		Shape shape = new Shape("Square", "Red");
		System.out.println(shape.getType());
		System.out.println(shape.getColor());
		shape.setType("Circle");
		shape.setColor("Black");
		System.out.println(shape.getType());
		System.out.println(shape.getColor());
		System.out.println(shape.cloneShape().getColor());
		System.out.println(shape.cloneShape().getType());
	}

}
