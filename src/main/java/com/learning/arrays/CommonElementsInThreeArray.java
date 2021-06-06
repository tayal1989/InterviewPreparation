package com.learning.arrays;

/**
 * <h1>CommonElementsInThreeArray</h1>
 * The CommonElementsInThreeArray.java program will find all the common elements 
 * present in three arrays
 * 
 * <p>
 * For example : <br>
 * input1 = {1, 7, 7, 10, 20, 20, 40, 80} ;	<br>
 * input2 = {6, 7, 7, 20, 20, 80, 100} ;		<br>
 *	input3 = {3, 7, 7, 15, 20, 20, 30, 70, 80, 120} ;	<br>
 *	will give the common elements as 7, 20 and 80
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		21-Jul-2016
 * @category O(n2)
 */

public class CommonElementsInThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {1, 7, 7, 10, 20, 20, 40, 80} ;	// 6
		int[] input2 = {6, 7, 7, 20, 20, 80, 100} ;	// 5
		int[] input3 = {3, 7, 7, 15, 20, 20, 30, 70, 80, 120} ;	// 8
		
		int[] arr = new int[input2.length] ;
		//Output: 20, 80
		
		int k = 0 ;
		
		int loop = 0 ;
		
		for(int i = 0 ; i < input2.length ; i++){		
			loop++ ;
			
			for(int j = 0 ; j < input1.length ; j++){
				loop++ ;
				if(input2[i] == input1[j]){
					arr[k] = input1[j];
					k++ ;					
					break ;
				}else if(input2[i] < input1[j]){
					break ;
				}
			}
		}
		
		/*for(int ind = 0 ; ind < arr.length ; ind++){
			System.out.print(arr[ind] + " ");
		}*/
		
		System.out.println();
		
		for(int i = 0 ; i < arr.length ; i++){
			
			loop++ ;
			
			if(arr[i] == 0){				
				break ;
			}
			
			for(int j = 0 ; j < input3.length ; j++){
				loop++ ;
				
				if(arr[i] == input3[j]){					
					System.out.println(input3[j]);
					break ;
				}else if(arr[i] < input3[j]){
					break ;
				}
			}
		}
		
		System.out.println("Loop count : " + loop);
		
	}

}
