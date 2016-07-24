package com.nlscinc.javapractise1.OtherMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Cal2Test {


	Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
		cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method");
	}

	@Test
	public void multest() {
		int actual=cal.mul(4, 2);
		int expected = 8;
		System.out.println("Multiplication test");
		Assert.assertEquals(expected, actual);
		Assert.assertFalse(false);
		System.out.println("Hello World");
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void divtest() {
		int actual=cal.div(4, 0);
		int expected = 0;
		System.out.println("Division test");
		Assert.assertEquals(expected, actual);
		
		
		
	}

	@Ignore
	@Test(timeout=1000)
	public void infinitetest()
	{
		cal.infinite();
	}
	
	
}
