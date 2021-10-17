package com.learning.arrays;

public class LastSurviving {

	public static void main(String[] args) {
		int[] arr = new int[101] ;
		
		System.out.println("Initial Players : ");
		
		for(int i = 0 ; i < 100 ; i++) {
			arr[i] = i + 1 ;
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int itr = 1, j = 0, ind = 0, div = 100 / itr, count = 0 ;
		boolean flag = false ;
		
		while(ind < div) {
			int killingMachine = arr[ind] ;
			int killedParty = arr[ind + 1] ;
			
			if (killingMachine < killedParty) {
				System.out.println(killingMachine + " has killed " + killedParty);
			} else {
				System.out.println("By default, " + killingMachine + " goes to another round");
				flag = true ;
			}
			
			if(div == 1) {
				System.out.println("\nRunners up : " + killedParty);
				System.out.println("\n\nUltimate Champion : " + killingMachine);
				break ;
			}
									
			arr[j++] = killingMachine ;
			ind = ind + 2 ;
			
			if(ind >= div) {
				itr = itr * 2 ;
				int i = 0 ;
				div = 100 / itr ;
				System.out.print("\nRemaining Players : ");
				for(i = 0 ; i < div; i++) {
					System.out.print(arr[i] + " ");
					count++ ;
				}
				
				if(flag == true || div == 1) {
					System.out.print(arr[i]) ;
				}
				
				if(100 % itr != 0 && count % 2 == 0) {
					div = 100 / itr + 1 ;
				}
				
				System.out.println();
				ind = 0 ;
				j = 0 ;
				count = 0 ;
				flag = false ;
			}
		}		
	}
}
