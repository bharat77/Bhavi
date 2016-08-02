package com.nlscinc.javapractise2.FBMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getFbPage  {
	
	public static WebDriver driver ;
	
	public static WebDriver gotoPage(String url)
	{ 
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
