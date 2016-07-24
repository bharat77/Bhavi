package com.nlscinc.javapractise1.OtherMavenProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(value = Parameterized.class)

public class ParameterizedTest {

	private static int a;
	private static int b;
	private static int expected;

	public ParameterizedTest( int a, int b, int expected)
	{
		this.a=a;
		this.b=b;
		this.expected=expected;
	}

	@Parameters
	public static Collection getData()
	{
		return Arrays.asList(new Object[][] {{1,1,2},{2,3,5},{3,4,7},{0,1,3}});
	}


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Calculator cal=new Calculator();
		Assert.assertEquals(expected, cal.add(a, b));
	}

}
