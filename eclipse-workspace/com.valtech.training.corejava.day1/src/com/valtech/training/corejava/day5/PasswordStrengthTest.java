package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordStrengthTest {
	
	
	@Test
	public void testcheckLower() {
		 PasswordStrength lwr = new PasswordStrength();
		 assertEquals(false, lwr.checkSmaller("abcdef"));
	}
	
	
	@Test
	public void testcheckUpper() {
		PasswordStrength upr = new PasswordStrength();
		 assertEquals(true, upr.checkCapital("ABCDEFGHIJKLMN"));
	}
	
	
	@Test
	public void testcheckDigit() {
		PasswordStrength dig = new PasswordStrength();
		 assertEquals(true, dig.checkCapital("1,2,3,4,5,6,7,8,9"));
	}
	
	
	@Test
	public void testcheckSpclChar() {
		 PasswordStrength splch = new PasswordStrength();
		 assertEquals(19, splch.checkSpecialChars("!@#$%^&*"));
	}

	@Test
	public void testPasswordStrength() {
		String a="Vh#125aa";
		PasswordStrength pc=new PasswordStrength();
		assertEquals("Moderate", pc.checkPasswordStrength(a));
		assertEquals(22,pc.total);
	}
	
}