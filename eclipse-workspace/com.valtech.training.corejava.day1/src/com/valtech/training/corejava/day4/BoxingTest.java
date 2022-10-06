package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxingTest {

	@Test
	public void test() {
		Integer i = new Integer(5);
		Integer j = 5; // Boxing -> converting primitive to object
		int k = j.intValue();
		int l = j; // unboxing -> converting object to primitive
	}

}
