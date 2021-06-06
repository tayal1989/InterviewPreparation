package com.learning.numbers;

public class ReverseNumberLeetcode {

	public static void main(String[] args) {
		long x = 234;
		long absoluteNumber = Math.abs(x);
		long result = 0;
		long remainder = 0;

		while (absoluteNumber != 0) {
			remainder = absoluteNumber % 10;
			absoluteNumber = absoluteNumber / 10;
			result = (result * 10) + remainder;
			if (result > Integer.MAX_VALUE / 10) {
				System.out.println(0);
				System.exit(0);
			}
		}

		if (x < 0) {
			result = -result;
		}

		System.out.println(result);
	}

}
