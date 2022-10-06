package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class NumberSorter implements Comparator<Integer> {
	
	
	private boolean isOdd(int a) {
		return Math.abs(a) % 2 == 1;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		//check both the numbers are odd
		//put it in ascending order
		boolean b1 = isOdd(o1);
		boolean b2 = isOdd(o2);
		if(b1 && b2) {
			if(o1 < o2) return -1;
			if(o1 == o2) return 0;
			return 1;
		}
		
		
		//check both the numbers are even
		//put it in descending order
		if(!b1 && !b2) {
			return o2-o1;
		}
			if(b1) 
		{
			return -1;
		}
		return +1;
	}
}