package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
		
		ArrayList<String>a=new ArrayList<String>();
		a.add("kiran");
		a.add("Sanjay");
		a.add("Jennifer");
		a.add("Martin");
		a.add("Aaron");
		a.add("Kishan");
		a.add("Anil");
		a.add("Sirish");
		
		System.out.println("List of students are :");
		for(String str:a)
		{
			System.out.println(str);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of student to be searched:");
		String srt=sc.next();
		int position=Collections.binarySearch(a, srt);
		System.out.println("position of "+" " +srt+" "+ "is :"+position);
	}
}
