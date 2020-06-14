package com.nokia.dev.array.problems;

/**
 * <h1>MergeSorting</h1>
 * MergeSort is a Divide and Conquer algorithm. 
 * 
 * <p>
 * Merge Sort divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. 
 * The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that 
 * assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. <br>
 * If r > l	<br>
 * 1. Find the middle point to divide the array into two halves:  <br>
 * 		middle m = (l+r)/2	<br>
 * 2. Call mergeSort for first half:   <br>
 *      Call mergeSort(arr, l, m)		<br>
 * 3. Call mergeSort for second half:
 *      Call mergeSort(arr, m+1, r)	<br>
 * 4. Merge the two halves sorted in step 2 and 3:	<br>
 *      Call merge(arr, l, m, r)
 * 
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		22-Dec-2015
 * @category O(n log n)
 */

public class MergeSorting {
	
	static int[] arr = {6,3,4,8,1} ;
	static int[] arr1 = {10, 5, 9, 7, 2} ;
	static int[] tempArr = new int[arr.length] ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		doMergeSort(0, arr.length - 1, arr) ;
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		doMergeSort(0, arr1.length - 1, arr1) ;
		
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		
		int[] tempArr1 = new int[arr.length + arr1.length] ;
		int lowerIndex = 0 ;
		int higherIndex = (arr.length + arr1.length) - 1 ;
		int middleIndex = lowerIndex + ((higherIndex - lowerIndex) / 2) ;
		
		for(int ind = 0 ; ind <= arr.length - 1 ; ind++){
			tempArr1[ind] = arr[ind] ;
		}
		
		/*System.out.println();
		
		for(int ind = 0 ; ind <= higherIndex ; ind++){
			System.out.print(tempArr1[ind] + " ");
		}*/
		
		for(int ind = 0 ; ind <= arr1.length - 1 ; ind++){
			tempArr1[ind + arr1.length] = arr1[ind] ;
		}
		
		/*System.out.println();
		
		for(int ind = 0 ; ind <= higherIndex ; ind++){
			System.out.print(tempArr1[ind] + " ");
		}*/
		
		int i = 0 ;
		
		int j = middleIndex + 1 ;
		int k = lowerIndex ;
		
		//System.out.println("MiddleInd : " + middleIndex);
		
		int[] arr2 = new int[arr.length + arr1.length] ;
		
		while((i <= middleIndex) && (j <= higherIndex)){
			if(tempArr1[i] <= tempArr1[j]){
				arr2[k] = tempArr1[i] ;
				i++ ;
			} else {
				arr2[k] = tempArr1[j] ;
				j++ ;
			}
			k++ ;
		}
		
		while((i <= middleIndex ) || (j <= higherIndex)){
			if(i <= middleIndex){
				arr2[k] = tempArr1[i] ;
				i++ ;
			} else {
				arr2[k] = tempArr1[j] ;
				j++ ;
			}
			
			k++ ;
		}
		
		System.out.println();
		
		for(int ind = 0 ; ind <= higherIndex/2 ; ind++){
			System.out.print(arr2[ind] + " ");
		}
	}

	private static void doMergeSort(int lowerIndex, int higherIndex, int[] arr) { 
		// TODO Auto-generated method stub
		if(lowerIndex < higherIndex){
			int middleIndex = lowerIndex + ((higherIndex - lowerIndex) / 2) ;
			doMergeSort(lowerIndex, middleIndex, arr) ;
			doMergeSort(middleIndex + 1, higherIndex, arr) ;
			mergeSort(lowerIndex, middleIndex, higherIndex, arr) ;
		}
	}

	private static void mergeSort(int lowerIndex, int middleIndex, int higherIndex, int[] arr) {
		// TODO Auto-generated method stub
		for(int ind = lowerIndex ; ind <= higherIndex ; ind++){
			tempArr[ind] = arr[ind] ;
		}
		
		int i = lowerIndex ;
		int j = middleIndex + 1 ;
		int k = lowerIndex ;
		
		while((i <= middleIndex) && (j <= higherIndex)){
			if(tempArr[i] <= tempArr[j]){
				arr[k] = tempArr[i] ;
				i++ ;
			} else {
				arr[k] = tempArr[j] ;
				j++ ;
			}
			k++ ;
		}
		
		while(i <= middleIndex){
			arr[k] = tempArr[i] ;
			i++ ;
			k++ ;
		}
	}

}
