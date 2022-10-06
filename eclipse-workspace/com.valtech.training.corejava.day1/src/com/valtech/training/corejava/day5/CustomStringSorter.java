package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class CustomStringSorter implements Comparator<String>{
	
	
	private int isLength(String s2) {
        return  s2.length();
    }
    private int VowelCount1(String s3) {
        String vowels = "AaEeIiOoUu";
        int count =0;
        for(int i =0 ;i<s3.length(); i++) {
            char s4 = s3.charAt(i);
            if(vowels.contains(""+s4)) {
                count++;
            }
        }
        return count;   
    }
    
    
    public int compare1(String o1, String o2) {
	        int so1 = isLength(o1);
	        int so2 = isLength(o2);
	        
	        int v1 = VowelCount1(o1);
	        int v2 = VowelCount1(o2);
	        
	        if(so1==so2) {
	            if(v1<v2) return -1;
	            if(v1==v2)
	                {
	                   return (o1.compareTo(o2)) ;
	                }
	            return +1;
	        }
	        if(so2<so1) {
	            return -1;
	        }
	        return +1;
	    }
		
	
	
	private int isLength1(String o1) {
		return 0;
	}



	private int VowelCount(String o2) {
		return 0;
	}



	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) {
			return -1;
		}
		if(o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}
}
