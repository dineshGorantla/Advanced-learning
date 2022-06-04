package com.example.coinChangeProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the amount");
			int v=sc.nextInt();
			
			ArrayList < Integer > al = new ArrayList < > ();
			int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
			
			int n = coins.length;
			for (int i = n - 1; i >= 0; i--) {
			  while (v >= coins[i]) {
			    v -= coins[i];
			    al.add(coins[i]);
			  }
			}
			System.out.println("The minimum number of coins is "+al.size());
			System.out.println("The coins are ");
			
			for (int i = 0; i < al.size(); i++) {
			  System.out.print(" " + al.get(i));
			}
		}
	}

}
