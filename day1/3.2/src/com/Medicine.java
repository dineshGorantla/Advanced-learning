package com;

public class Medicine {
	public void displayLabel()
	{
	System.out.println("Company : Cipla");
	System.out.println("Address : Hyderabad");
	}
	}
	class Tablet extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("store below 25 degree celsius");
	}
	}
	class Syrup extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("Physician prescription should be complusory");
	}
	}
	class Ointment extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("only for external use");
	}
}
