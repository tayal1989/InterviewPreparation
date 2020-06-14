package com.nokia.dev.number.problem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number :") ;
		long number = 0 ;
		
		try{
			number = sc.nextLong() ;
		} catch (InputMismatchException e) {
			System.out.println("This is not a number");
			System.exit(0);
			//System.out.println(e.getMessage());
		}
		
		long rem, sum = 0 ;
		long remSum, addSum = 0 ;
		
		while(number != 0){
			rem = number % 10 ;
			sum = sum + rem ;
			number = number / 10 ;
				
			if(sum >= 10){
				addSum = sum / 10 ;
				remSum = sum % 10 ;
				sum = remSum + addSum ;
			}
			
		}
		
		System.out.println("Sum : " + Math.abs(sum)) ;	
		
		sc.close() ;
	}

}
