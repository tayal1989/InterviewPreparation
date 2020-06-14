package com.nokia.dev.string.problems;

import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {

		String line = "abcdefghijklmnopqrstuvwxyz";
		
		/*
		 * '.' represents single character
		 * [amn] represents either a or m or n should come 1 time, if a or m comes both then false
		 * [^amn] except a or m or n
		 * https://www.javatpoint.com/java-regex
		 */
		
		System.out.println(Pattern.matches(".b", "ab")); //true
		System.out.println(Pattern.matches(".b", "cb")); //true
		System.out.println(Pattern.matches(".b", "abc")); //false
		System.out.println(Pattern.matches("..b", "acb")); //true
		
		System.out.println();
		
		System.out.println(Pattern.matches("[amn]", "a"));	//true
		System.out.println(Pattern.matches("[amn]", "m"));	//true
		System.out.println(Pattern.matches("[amn]", "n"));	//true
		System.out.println(Pattern.matches("[amn]", "am"));	//false
		System.out.println(Pattern.matches("[amn]", "bat"));	//false
		System.out.println(Pattern.matches("[^amn]", "b"));	//true
		
		System.out.println();
		System.out.println(Pattern.matches("[man]?", "man"));
	}

}
