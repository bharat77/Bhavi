package com.nlscinc.javapractise1.OtherMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalTest {
	
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
	public void Firsttest() {
		int actual=cal.add(2,3);
		int expected =5;
		System.out.println("First Test");
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void Secondtest() {
		int actual=cal.mul(2,3);
		int expected =6;
		System.out.println("Second Test");
		Assert.assertEquals(expected, actual);
		
	}

}
