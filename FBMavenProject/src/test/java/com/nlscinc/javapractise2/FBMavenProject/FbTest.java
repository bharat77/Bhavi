package com.nlscinc.javapractise2.FBMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FbTest {
  
	public int result;
	public boolean login;
	public boolean newsfeed;
	
	
@Test
  public void signup() {
	
	System.out.println("Registration done");
	result=0;
	
	Assert.assertTrue(true);
	
  }
  

@Test (dependsOnMethods={"signup"},alwaysRun=true)
public void signin() {
	
	if(result==0)
		System.out.println("login done");
	
		
}


@Test (dependsOnMethods={"signin"})
public void newsfeedpage() {
	
	result= 1;
	if(login =true)
	System.out.println("Display news feed page");
	
     //Assert.assertEquals(true, true);
	
}


@Test (dependsOnMethods={"newsfeedpage"})
public void signout() {
	
	if(result==1)
		System.out.println("Signout");
	System.out.println( "show me logout title" );
		
}

  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }

  
  
}
