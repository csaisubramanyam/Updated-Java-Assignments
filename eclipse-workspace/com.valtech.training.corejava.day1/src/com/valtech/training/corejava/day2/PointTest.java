package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class PointTest {
	
	public void testEquals() {
		Point p = new Point(2,3);
		Point p1 = new Point(2,3);
		Point p2 = p;
		assertTrue(p == p2);
		assertFalse(p == p1);
		assertTrue(p.equals(p1));
		assertEquals(p.hashCode(),p1.hashCode());
	}

	@Test
	public void testDistance() {
		Point p = new Point();
		assertEquals(0.0, p.distance(p),0.0000001);
	    p = new Point(10,20);
	    assertEquals(Math.sqrt(10*10+20*20),p.distance(p),0.0000001);
	}
	
	public void testSetGet() {
		Point p = new Point();
		p.setX(10);
	}

}
