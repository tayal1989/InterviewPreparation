package com.edx.exam.test;

//Import ArrayList class header file 
import java.util.ArrayList; 

/**
 *  <h1>ArrayList_Example</h1>
 * The ArrayList_Example.java program will show the usages for array list
 * 
 * <p>
 * In this class, we can see how we can add a number in the array list, how 
 * to remove elements and fetch
 * @author v4agarwa 29-Dec-2015
 */
public class ArrayList_Example { 
	public static void main(String[] args) { 
		//Create object of ArrayList class. It will store only string values. 
		ArrayList<String> Sample = new ArrayList<String>(); 
		//Now you can store any number of values In this array list as below. Size constrain will comes never. 
		
		Sample.add("button1"); //Putting an Item In arraylist at Index = 0. 
		Sample.add("button2"); //Putting an Item In arraylist at Index = 1. 
		Sample.add("button3"); //Putting an Item In arraylist at Index = 2. 
		Sample.add("button4"); //Putting an Item In arraylist at Index = 3. 
		
		for(int i=0; i<Sample.size();i++){//loop will execute till size of arraylist. 
			System.out.println(Sample.get(i)); //print arraylist values one by one. 
		} 
		
		System.out.println("*************************"); //To get the Index of an Item from arraylist.
		
		int ItemIndex = Sample.indexOf("button3"); 
		System.out.println("Index Of button3 Item = "+ItemIndex); 
		System.out.println("*************************"); 
		
		Sample.remove(1);//To remove an Item from arraylist. 
		
		for(int i=0; i<Sample.size();i++){ 
			System.out.println(Sample.get(i)); 
		} 
		
		System.out.println("*************************"); 
		Sample.set(2, "Button8");//To reset value of an arraylist item. 
		
		for(int i=0; i<Sample.size();i++){ 
			System.out.println(Sample.get(i)); 
		}
		
	}
}
