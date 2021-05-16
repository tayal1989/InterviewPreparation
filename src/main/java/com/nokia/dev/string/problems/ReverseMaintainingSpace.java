package com.nokia.dev.string.problems;

public class ReverseMaintainingSpace {

	public static void main(String[] args) {
		String str = "java and automation" ;
		String outputStr = "" ;
		int count = 0 ;
		
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			if(str.charAt(count) == ' ') {
				outputStr = outputStr + str.charAt(count) ;
				i = i + 1 ;
			} else if(str.charAt(i) != ' ') {
				outputStr = outputStr + str.charAt(i) ;				
			} else if(str.charAt(i) == ' ') {
				outputStr = outputStr + str.charAt(--i) ;
			}
			count++ ;
		}
		
		System.out.println(outputStr);
	}
}
