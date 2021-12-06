package com.learning.test;

import java.util.regex.Pattern;

/**
 * @author Vishal Agarwal
 * @version Creation time: 08-Nov-2021 9:30:36 pm
 * @classDescription
*/

public class InterviewTest {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z]{1,6}['_']{0,1}[0-9]{0,4}@hackerrank.com", "aj_09@hackerrank.com"));  
	}

}
