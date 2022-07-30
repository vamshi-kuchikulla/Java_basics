package com.cstech.loop;

public class IfElse {
	public static void main(String[] args) {
       int x=10;
       int y=12;
       int z= 13;
       
       //using ternary Operater
       String output = (z%2==0)?"even number":"odd number";
       System.out.println(output);
       
       if(x+y>20) {
    	   System.out.println("x+y is greater then 20");
       }else {
    	   System.out.println("x+y is lesser then 20");
       }
	}
}
