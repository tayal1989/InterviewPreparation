package com.learning.arrays;

/**
 * <h1>AllCombForAddingNoInArray</h1>
 * The AllCombForAddingNoInArray.java program will find out all the 
 * combination for addition for a given number.
 * 
 * <p>
 * For example, if we have to find combination for 5 then pairs will be
 * 1,4
 * 2,3
 * 1,3,1
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n2)
 */

public class AllCombForAddingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		
		int value = 10 ;
		int subValue = 0 , j = 0, i = 0 ;
		
		int[] outArr = new int[10] ;
		
		while( i < arr.length ){
			if(i != 0){
				j++ ;
			}
			int ind  = 0 ;
			subValue  = value - arr[j] ;
			outArr[ind] = arr[j] ;
			ind++ ;
			
			for(j = i + 1; j < arr.length ; j++){
				System.out.println("arr" + arr[j] + " " + j);
				subValue  = subValue - arr[j] ;
				if((subValue > 0) || (subValue == 0)){
					outArr[ind] = arr[j] ;
					ind++ ;
					
					if(subValue == 0){
						break ;
					}
				}
			}
			
			System.out.println("Unique element in array is : ") ;
			
			for(int k = 0 ; k < outArr.length/2 - 1 ; k++){							
				System.out.print(outArr[k] + " ");
			}
			
			System.out.println("Value of j : " + j + " Value of i : " + i);
			
			
			break ;
		}
	}

}
