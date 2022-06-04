package com;

import java.util.Scanner;

public class Rectangle {
	int length; 
    int breadth; 
    int area; 

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        breadth = sc.nextInt();
    }
    Rectangle(){
    	length=1;
    	breadth=1;
    	
    }

    void findArea() {
    	if(length>2 && length<20) {
        area = length * breadth;
    	}
    	else {
    		System.out.println("Invaild input");
    	}
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);   
    }

}
