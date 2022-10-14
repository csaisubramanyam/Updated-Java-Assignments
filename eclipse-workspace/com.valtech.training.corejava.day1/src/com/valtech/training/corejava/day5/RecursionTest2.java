package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTest2 {

	@Test
	static long factorial(long n) 
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n*factorial(n-1));
		}
	}

	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=4;    //It is the number to calculate factorial    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}  

