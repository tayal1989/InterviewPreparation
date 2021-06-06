package com.learning.practise;

public class HelloWorld {
	
	public void printOutput(){
		System.out.println("My name is Vishal.");
	}
	
	static int countSorted(int[] countArray){	
		int count = 1; 
		int max = 1;
		for (int k = 1; k < countArray.length; k++) {
			if (countArray[k-1] <= countArray[k]) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 1;
			}
		}
		
		if(count > max){
			max = count + 1;
		}
		return max;
	}
	
	static int foo(int n){
	    if (n < 1){
	        return 0;
	    } else { 
	        return 1 + foo(n / 10);
	    }
	}
	
	static void bar(int[] array, int num, int lim){
	    int i = 0;
	    int v = 0;
	    int cn = 1;
	    int co = 1;
	    while ((i < array.length) && (array[i] + num < lim)){
	        if (array[i] <= array[v]){
	            v = i; /* Statement A */
	            cn++;
	        }  
	        i++; /* Statement B */
	        co++;
	    }
	    System.out.println(v);
	    System.out.println("Value of cn " + cn);
	    System.out.println("Value of co " + co);
	}
	
	
	static int foo1(String x, int number, int[] array){
	    number = array.length;
	    x = x + "xAtfoo";
	    for (int i=0; i < number; i++){
	        array[i] = array[i] + x.length();
	    }
	    x = x + "Success";
	    System.out.println(number);
	    System.out.println(x);
	    for(int j = 0; j < array.length; j++){
	    	System.out.println(array[j]);
	    }
	    return x.length();
	}
	
	static void bar(){
	    String s = new String("Hello");
	    int num = 6;
	    int [] array = {1, 2, 3, 4};
	    int result = 0;
	    System.out.println(array[1]);
	    result = foo1(s, num, array);
	    System.out.println(result);
	}
	
	static int foo2(int[] array, int num){
	    int i = array.length - 1;
	    while (i >= 0){
	        if (array[i] > num){
	            return i;
	        }
	        i--;
	    }
	    return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		HelloWorld hw = new HelloWorld();
		hw.printOutput();
		
		AnnotationExample ae = new AnnotationExample();
		ae.printOutput();
		
		int array[] = {81,13,10,34,23,234,8,33};
		int value = array[0]; 
		int value2 = value;
		int count = 0;
		for (int element : array){
		    if (element > value){
		        value = element;
		    }
		    if (element < value2){
		        value2 = element;
		    }
		    count = count + 1;
		}
		//System.out.println(value+" "+value2 + " " + count);
		
		
		
		int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
		System.out.println(countSorted(arr));
		
		System.out.println("Foo is :-->" + foo(1000));
		
		int checkArr[] = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
		bar(checkArr, 1, 8);
		
		bar();
		
		int arrfoo[] = {0, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, 12};
		System.out.println(foo2(arrfoo, 1));
	}

}