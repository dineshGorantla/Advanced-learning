package com;

class Rectangle {
	 int length; 
     int breadth; 
     
     void setData(int l, int b) 
     {  
       length =l; 
       breadth=b; 
     } 
     
     int area() 
     { 
       int rectArea; 
       rectArea = length * breadth; 
       return rectArea; 
     } 
}
