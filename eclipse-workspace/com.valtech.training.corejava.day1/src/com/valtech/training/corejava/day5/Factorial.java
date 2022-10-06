package com.valtech.training.corejava.day5;

public class Factorial {
	
	public long factorial(long n) {
		if(n==1) {
			return 1;}
		else {
			return n*factorial(n-1);
	}
}
	
}
