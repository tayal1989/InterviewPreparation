package com.learning.practise;

/**
 * @author Vishal Agarwal
 * @version Creation time: 23-Nov-2021 6:36:06 pm
 * @classDescription
*/

public class Shape {
	String type;
	String color;
	
	public Shape(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Shape cloneShape() {
		return new Shape(getType(), getColor());
	}
}
