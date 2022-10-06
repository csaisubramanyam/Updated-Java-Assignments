package com.valtech.training.corejava.day5;

public class Recursion2 {
	public static long factorial(long n) 
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

	public static void main(String args[]){
		  long fact=1;
		  int number=7;
		  fact = factorial(number);
		  System.out.println(fact);
		 }
}
