package com.valtech.training.corejava.day3;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.valtech.training.corejava.day1.Point;
import org.junit.Test;

public class MapTest {

	@Test
	public void testHashMap() {
		Map<String,Point> points = new HashMap<>();
		points.put("1,1",new Point(1,1));
		points.put("1,2",new Point(1,1));
		points.put("2,2",new Point(2,2));
		points.put("1,2",new Point(1,1));
		assertEquals(3,points.size());
//		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//			type type = (type) iterator.next();
//			
//		}
		Set<String> keys = points.keySet();
		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println("Key "+key +" Value "+points.get(key));
		}
	}

}
