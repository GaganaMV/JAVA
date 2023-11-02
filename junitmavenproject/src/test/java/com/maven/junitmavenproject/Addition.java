package com.maven.junitmavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	public int add(int a,int b) {
		return a+b;
	}
	@Test
	public void addTest() {
		assertEquals(4, add(2, 2));
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	@Test
	public void subTest() {
		assertEquals(1, sub(4, 3));
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	@Test
	public void mulTest() {
		assertEquals(12, mul(4, 3));
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	@Test
	public void divTest() {
		assertEquals(5, div(10, 2));
	}
	
	
	public String evenOdd(int num) {
		if(num%2==0) {
			return "even";
		}else {
		return "odd";
		}
	}
	
	@Test
	public void evenOddTest() {
		assertEquals("even", evenOdd(8));
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
		assertEquals(120, fact(5));
	}
	
	
	
	
	
	
	

}
