package com.nokia.dev.array.problems;

public class ShowDuplicateNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5} ;
		int[] arr = {1, 2, 3, 3, 2, 4, 1} ;
		
		int[] outArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		
		int j = 0 ;
		
		boolean flag = false ;
		
		for(int i = 0 ; i < arr.length ; i++){
			j = arr[i] ;
			outArr[j]++ ;
		}
		
		for(int i = 0 ; i < outArr.length ; i++){
			if(outArr[i] == 1){
				System.out.println("Unique element in array is : " + i);
				flag = true ;
			}
		}
		
		if(flag == false){
			System.out.println("No unique element");
		}
		
		
	}

}
