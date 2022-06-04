package com;

public class ParserUsingSplitMethod {
	public static void main(String[] args) {
		String str=("23  +  45 -(   343 / 12  )");
		String[] m=str.split("\\\s");
		
		for(String split:m){  
			System.out.println(split); 

	}
	}
}
