package com;

public class ArraySum {
	public static void main(String[] args) {
		//Initialize array
		int [] array=new int[] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0,};
		
		int sum=0;
		int min=0;
		//Length of an array
		System.out.println("Length of an array :"+ array.length);
		
		for (int i = 0; i < array.length; i++) 
			{  
	           sum = sum + array[i];
	           System.out.println("Sum of all the elements of an array: " + sum);
	           
		       double average = sum /array.length;
		       System.out.println("Sum of all the elements of an array:"+average);
		       
	           if(array[i] <min)  
	               min = array[i];
	           System.out.println("Smallest element in an array:"+min);
	        }    
	}
}
