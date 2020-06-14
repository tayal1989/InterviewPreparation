/**
 * 
 */
package com.nokia.dev.string.problems;

/**
 * @author v4agarwa 09-Dec-2015
 */
public class Anagram {
	
	public static String stringAfterRemovingDuplicate(String tempStr){
		String outputStr = "" ;
		
		String str = tempStr ;
		
		str = str.toLowerCase() ;
		
		int[] strArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		for(int ind = 0 ; ind <= str.length() - 1 ; ind++){
			int value = str.charAt(ind) - 97 ;
			if((value >= 0) && (value <= 25)){
				strArr[value]++;
			}
		}
		
		for(int ind = 0, i = 97 ; ind < strArr.length ; ind++, i++){
			if(strArr[ind] != 0){
				char value = (char)i ;
				outputStr = outputStr + value + strArr[ind] ;
			}
			
		}
		
		return outputStr ;
	}

	/**
	 * TODO
	 * @param args
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String firstStr = "mary" ;
		String secondStr = "army" ;*/
		
		String firstStr = "anagramm" ;
		String secondStr = "marganaa" ;
		
		/*String firstStr = "test" ;
		String secondStr = "tester" ;*/
		
		String resFirstStr = stringAfterRemovingDuplicate(firstStr) ;
		String resSecStr = stringAfterRemovingDuplicate(secondStr) ;
		System.out.println(resFirstStr);
		System.out.println(resSecStr);
		
		int i = 0, count = 0 ;
		
		while(i < resSecStr.length()) {
			if(resFirstStr.length() == resSecStr.length()){
				if(resFirstStr.charAt(i) != resSecStr.charAt(i)) {
					System.out.println("Strings are not anagram");
                    break ;
				} else if(resFirstStr.charAt(i) == resSecStr.charAt(i)) {
					i++ ;
					count++ ;
				}
			} else {
				System.out.println("Strings are not anagram");
				break ;
			}
		}
		
		if((resFirstStr.length() == resSecStr.length()) && (count == (resFirstStr.length()) )) {
			System.out.println("Strings are anagram");
		}
	}

}
