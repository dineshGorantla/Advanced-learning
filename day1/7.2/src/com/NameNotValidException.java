package com;

public class NameNotValidException extends Exception {
	public String toString()
    {
         return ("Name is not valid. please ReEnter the Name");
    }
}

