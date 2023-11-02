package com.maven.junitmavenproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvenOddP {
	int a[]= {1,2,3};
	int b[]= {1,2,3};
	
	String s="Hello";
	String s1="Hello";
	String s2="Hii";
	
	@Test
	public void test3() {
		assertNotEquals(s, s2);
	}
	@Test
	public void test2() {
		assertEquals(s1, s);
		assertSame(s, s1);
		assertNotNull(s);
	}

	
	@Test
	public void test1() {
		assertArrayEquals(a, b);
	}
	
	
	public static boolean isEvenOrOdd(int num) {
		boolean result=false;
		if(num%2==0) {
			result= true;
		}
		return result; 
	}
	
	@Test
	public void evenTest() {
		assertTrue(EvenOddP.isEvenOrOdd(12));
	}
	
	@Test
	public void oddTest() {
		assertFalse(EvenOddP.isEvenOrOdd(13));
	}
	
	
	public int fact(int n) {
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	@Test
	public void testFact() {
		assertSame(120, fact(5));
	}
	
	@Test
	public void testFact1() {
		assertNotEquals(121, fact(5));
	}
	
	
	
	
	

}
