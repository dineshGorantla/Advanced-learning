package com.example.FirstRepeatingElement;

import java.util.Scanner;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp=0;
        // select an element
        for(int i=0;i<n;i++) 
        //traverse ahead and check for duplicate
        for(int j=i+1;j<n;j++) 
            if(arr[i]==arr[j])
              {
                System.out.println(arr[i]);
                temp=1;
                i=n;j=n;
              }
        if(temp==0)
        System.out.println("No repeating integer found");
	}

}
