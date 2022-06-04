package com;

public class StringManipulation {
	public static void main(String[] args) {
		String str= "JAVA is Simple";
		
		//UpperCase
		System.out.println(str.toUpperCase()); 
		//LowerCase
		System.out.println(str.toLowerCase()); 
		
		//1st words of letter
		String[] words=str.split("\\s");
		for(String w:words){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		// Change order 
		String[] words1=str.split("\\s"); 
		for(String w:words1){  
			System.out.println(w); 
		}
		
		//String Builder reverse
		StringBuilder str2= new StringBuilder("JAVA is Simple");
		
		
		System.out.println("String = " + str2.toString());
		StringBuilder reverseStr = str2.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		//Total Length of the string
		System.out.println("length of string " + str.length());
	}
}
