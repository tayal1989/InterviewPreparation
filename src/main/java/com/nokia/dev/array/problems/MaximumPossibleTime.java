package com.nokia.dev.array.problems;

import java.util.ArrayList;

public class MaximumPossibleTime {
	
	public static void findMaxTimeWithRepetitionOfDigits(int[] arr) {
		int maxHour1 = 0 ;
		int maxHour2 = 0 ;
		int maxMin1 = 0 ;
		int maxMin2 = 0 ;
		
		boolean flagMaxHour1 = false ;
		boolean flagMaxHour2 = false ;
		boolean flagMaxMin1 = false ;
		boolean flagMaxMin2 = false ;
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] <= 2 && maxHour1 <= arr[i]) {
				maxHour1 = arr[i] ;
				flagMaxHour1 = true ;
			}
		}		
		
		for(int i = 0; i < arr.length ; i++) {
			if(maxHour1 == 2) {
				if(arr[i] <= 3 && maxHour2 <= arr[i]) {
					maxHour2 = arr[i] ;
					flagMaxHour2 = true ;
				}
			} else if(maxHour1 == 0 || maxHour1 == 1) {
				if(arr[i] <= 9 && maxHour2 <= arr[i]) {
					maxHour2 = arr[i] ;
					flagMaxHour2 = true ;
				}
			}
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] <= 5 && maxMin1 <= arr[i]) {
				maxMin1 = arr[i] ;
				flagMaxMin1 = true ;
			}
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] <= 9 && maxMin2 <= arr[i]) {
				maxMin2 = arr[i] ;
				flagMaxMin2 = true ;
			}
		}
		
		if(flagMaxHour1 == false || flagMaxHour2 == false || flagMaxMin1 == false || flagMaxMin2 == false) {
			System.out.println("-1");
			System.exit(0);
		}
		
		System.out.println("Max Hour 1 : " + maxHour1);
		System.out.println("Max Hour 2 : " + maxHour2);
		System.out.println("Max Min 1 : " + maxMin1);
		System.out.println("Max Min 2 : " + maxMin2);
		System.out.println("Max Time : " + maxHour1 + maxHour2 + ":" + maxMin1 + maxMin2);
	}
	
	public static void findMaxTimeWithoutRepetitionOfDigits(int[] arr) {
		int maxHour1 = 0 ;
		int maxHour2 = 0 ;
		int maxMin1 = 0 ;
		int maxMin2 = 0 ;
		int index = 0 ;
		
		boolean flagMaxHour1 = false ;
		boolean flagMaxHour2 = false ;
		boolean flagMaxMin1 = false ;
		boolean flagMaxMin2 = false ;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			list.add(arr[i]);
		}
		
		for(int i = 0; i < list.size() ; i++) {
			int temp = list.get(i) ;
			if(temp <= 2 && maxHour1 <= temp) {
				maxHour1 = temp ;
				index = i ;
				flagMaxHour1 = true ;
			}
		}
		
		list.remove(index) ;
		
		for(int i = 0; i < list.size() ; i++) {
			int temp = list.get(i) ;
			if(maxHour1 == 2) {
				if(temp <= 3 && maxHour2 <= temp) {
					maxHour2 = temp ;
					index = i ;
					flagMaxHour2 = true ;
				}
			} else if(maxHour1 == 0 || maxHour1 == 1) {
				if(temp <= 9 && maxHour2 <= temp) {
					maxHour2 = temp ;
					index = i ;
					flagMaxHour2 = true ;
				}
			}
		}
		
		list.remove(index) ;
		
		for(int i = 0; i < list.size() ; i++) {
			int temp = list.get(i) ;
			if(temp <= 5 && maxMin1 <= temp) {
				maxMin1 = temp ;
				index = i ;
				flagMaxMin1 = true ;
			}
		}
		
		list.remove(index) ;
		
		for(int i = 0; i < list.size() ; i++) {
			int temp = list.get(i) ;
			if(temp <= 9 && maxMin2 <= temp) {
				maxMin2 = temp ;
				index = i ;
				flagMaxMin2 = true ;
			}
		}
		
		list.remove(index) ;
		
		if(flagMaxHour1 == false || flagMaxHour2 == false || flagMaxMin1 == false || flagMaxMin2 == false) {
			System.out.println("-1");
			System.exit(0);
		}
		
		System.out.println("Max Hour 1 : " + maxHour1);
		System.out.println("Max Hour 2 : " + maxHour2);
		System.out.println("Max Min 1 : " + maxMin1);
		System.out.println("Max Min 2 : " + maxMin2);
		System.out.println("Max Time : " + maxHour1 + maxHour2 + ":" + maxMin1 + maxMin2);
	}

	public static void main(String[] args) {
		//int[] arr = {5, 3, 2, 9};
		//int[] arr = {1, 2, 3, 4};
		int[] arr = {0, 0, 0, 9};
		//int[] arr = {5, 3, 4, 5};
		
		findMaxTimeWithRepetitionOfDigits(arr);
		findMaxTimeWithoutRepetitionOfDigits(arr);
	}

}
