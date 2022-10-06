package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class CustomStringSorterTest {

	@Test
	public void testVowelCount() {
		Arrays.sort(names,new CustomStringSorter());
		assertArrayEquals(new String[] {"z","ab","pqr","abcd","lmno"}, names);
	}
	
	@Test
	public void testLength() {
		String[] names = new String [] {"abcd","pqr","lmno","ab","z"};
		Arrays.sort(names,new CustomStringSorter());
		assertArrayEquals(new String[] {"z","ab","pqr","abcd","lmno"}, names);
	}
}
