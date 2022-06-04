package com.example.findnthNode;

import java.util.Scanner;

public class LinkedList {

		 
	    private Node head;
	 
	    private static class Node {
	        private int value;
	        private Node next;
	 
	        Node(int value) {
	            this.value = value;
	 
	        }
	    }
	 
	    public void addToLast(Node node) {
	 
	        if (head == null) {
	            head = node;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	 
	            temp.next = node;
	        }
	    }
	 
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.format("%d ", temp.value);
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    public int nthFromLastNode(Node head,int n)
	    {
	       
	       
	    	Node firstPtr=head;
	        Node secondPtr=head;
	  
	        int count = 1;
	
	        while (firstPtr != null)
	        {
	        	if (count == (n+1))  
	         	{
	             break;
	            }
	            count += 1;
	            firstPtr = firstPtr.next;
	        }
	        if (count == (n+1))
	        {
		        while(firstPtr!=null)
		        {
		            firstPtr=firstPtr.next;
		            secondPtr=secondPtr.next;
		        }
		        
		        return secondPtr.value;
	        }
	        else
	    	   return -1;
	    }
	 
	    public static void main(String[] args) {
	        LinkedList l = new LinkedList();
	        // Creating a linked list
	        Node head=new Node(1);
	        l.addToLast(head);
	        l.addToLast(new Node(2));
	        l.addToLast(new Node(3));
	        l.addToLast(new Node(4));
	        l.addToLast(new Node(5));
	        l.addToLast(new Node(6));
	        l.addToLast(new Node(7));
	        l.addToLast(new Node(8));
	        l.addToLast(new Node(9));

	 
	        l.printList();
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the nth node number:");
	        int node = sc.nextInt();
	        int nthNodeFromLast= l.nthFromLastNode(head,node);
	        System.out.println("The nth node from end is : "+ nthNodeFromLast);
	 
	    }
	 

}
