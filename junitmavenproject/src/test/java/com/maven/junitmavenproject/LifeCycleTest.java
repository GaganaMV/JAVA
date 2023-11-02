package com.maven.junitmavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleTest {
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("connect to database");
	}
	
	@Before
	public void beforeEach() {
		System.out.println("load the schema");
	}
	
	@After
	public void afterEach() {
		System.out.println("Drop the schema");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("Disconnect from the database");
	}
	
	@Test
	public void test1() {
		System.out.println("Test One");
	}
	
	

}
