/**
 * 
 */
package com.learning.strings;

/**
 * @author v4agarwa 23-Dec-2015
 */
public class Strng_Example { 
	public static void main(String[] args) { 
		String st1 = "This World is Very Nice"; 
		String st2 = " And Beautiful."; 
		
		//Comparing two strings. Return true If both match else return false. 
		System.out.println("st1 equals to st2? -> "+st1.equals(st2)); 
		
		//Concatenates st2 with st1. 
		System.out.println("Concatenation of st1 and st2 Is -> "+st1.concat(st2)); 
		
		//Retrieve the 9th Indexed character from string. 
		System.out.println("Character at Index 9 Is -> "+st1.charAt(9)); 
		
		//Find the length of string. 
		System.out.println("Length Of St1 -> "+st1.length()); 
		
		//Converting whole string In lower case. 
		System.out.println("String In Lowercase -> "+st1.toLowerCase()); 
		
		//Converting whole string In upper case. 
		System.out.println("String In uppercase -> "+st1.toUpperCase()); 
		
		//Retrieve the Index of first 'i' character. 
		System.out.println("Index of 1st charater i Is -> "+st1.indexOf('i')); 
		
		//Retrieve the index of 2nd most 'i' character. 
		System.out.println("Index of 2nd charater i Is -> "+st1.indexOf('i', 3)); 
		
		//Retrieve the Index of word 'Very' from string. 
		System.out.println("Index of word Very Is -> "+st1.indexOf("Very")); 
		
		//Converting value From int to string. 
		int j = 75; 
		String val2 = String.valueOf(j); 
		System.out.println("Value Of string val2 Is -> "+val2); 
		
		//Converting string to integer. 
		String val1="50"; 
		int i = Integer.parseInt(val1); 
		System.out.println("Value Of int i Is -> "+i); 
		
		//Print the String starting from 5th Index to 12th Index. 
		System.out.println("Retrieving sub string from string -> "+st1.substring(5, 13)); 
		
		//Split string. 
		String splt[] = st1.split("Very"); 
		System.out.println("String Part 1 Is -> "+splt[0]); 
		System.out.println("String Part 2 Is -> "+splt[1]); 
		
		//Trim String. 
		System.out.println("Trimmed st2 -> "+st2.trim()); 
	} 
}
