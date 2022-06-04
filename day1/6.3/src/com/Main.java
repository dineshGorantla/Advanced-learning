package com;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) 
	{
		LinkedList<Employee> v=addInput();
		display(v);
	}
	public static LinkedList<Employee> addInput()
	{
		Employee e1=new Employee(01,"harish","Karnataka");
		Employee e2=new Employee(02,"farook","Haryana");
		Employee e3=new Employee(03,"Sandesh","sikkim");
		Employee e4=new Employee(04,"girish","Hyderabad");
		
		LinkedList<Employee>l = new LinkedList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		return l;
	}
	public static void display(LinkedList<Employee>v)
	{
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEmpName()+"\t"+e.getAddress());
		}

	}
}
