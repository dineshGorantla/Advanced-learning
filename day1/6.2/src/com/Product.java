package com;

import java.util.Hashtable;
import java.util.Scanner;

public class Product {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Hashtable<String,String> hs=new Hashtable<String,String>();
		System.out.println("Enter the product id and name;");
		for(int i=0;i<10;i++)
		{
			hs.put(sc.next(),sc.next());
		}
		System.out.println("Product list is:");
		System.out.println(hs);
		System.out.println("Enter the product id to be removed:");
		String id = sc.next();
		hs.remove(id);
		System.out.println("item removed");
		System.out.println("Product list is:");
		System.out.println(hs.toString());
		System.out.println("Enter the product id to be searched:");
		String str=sc.next();
		if(hs.containsKey(str))
		{
			System.out.println(hs.get(str));
		}
		else {
			System.out.println("Does not exists");
		}

	}

}
