package com.nlscinc.javapractise2.FBMavenProject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class FbPOM extends getFbPage {
	
	final static Logger logger= Logger.getLogger(FbPOM.class);
	
	
	
	String url="https://www.facebook.com/";
	//WebElement element;
	
	By fname = By.id("u_0_1");
	By lname= By.id("u_0_3");
	By email= By.id("u_0_6");
    By reemail = By.id("u_0_9");
    By pwd=By.id("u_0_b");
    By bmonth =By.id("Month");
    By bday =By.id("day");
    By byear=By.id("year");
    By malebutton = By.xpath("//span[@id='u_0_h']//label[contains(text(),'Male')]//preceding-sibling::input");
    By signupbutton= By.id("u_0_j" );
    By signinemail = By.id("email");
    By signinpwd=By.id("pass");
    By signin=By.id("u_0_o");
    By NewsFeed= By.tagName("News Feed");
    By navigation=By.id("userNavigationLabel");
    By logout =By.partialLinkText("menu_logout");
    
    public FbPOM(String url)
    {
    	this.url=url;
    	PageFactory.initElements(driver,this);
    }
    
    public FbWelcomePage signup(String firstname, String Lastname,String signupemailid, String signuppassword) throws InterruptedException
    {
    	logger.debug("Welcome Page signup");
    	
    	FbWelcomePage page = null;
    	driver.findElement(fname).clear();
    	driver.findElement(fname).sendKeys(firstname);
    	Thread.sleep(1000);
    	
    	driver.findElement(lname).clear();
    	driver.findElement(lname).sendKeys(Lastname);
    	Thread.sleep(1000);
    	
    	driver.findElement(email).clear();
    	driver.findElement(email).sendKeys(signupemailid);
    	Thread.sleep(1000);
    	
    	driver.findElement(reemail).clear();
    	driver.findElement(reemail).sendKeys(signupemailid);
    	Thread.sleep(1000);
    	
    	driver.findElement(pwd).clear();
    	driver.findElement(pwd).sendKeys(signuppassword);
    	Thread.sleep(1000);
    	
    	driver.findElement(bmonth).click();
    	Select drpdwn=new Select((WebElement) bmonth);
    	drpdwn.selectByIndex(3);
    	Thread.sleep(3000);
    	
    	WebElement bdayELem = driver.findElement(bday);
    	Select drpdwn2=new Select( bdayELem);
    	drpdwn2.selectByIndex(3);
    	Thread.sleep(3000);
    	
    	driver.findElement(byear).click();
    	Select drpdwn3=new Select((WebElement) bday);
    	drpdwn3.selectByIndex(1);
    	Thread.sleep(3000);
    	
    	driver.findElement(malebutton).isSelected();
    	Thread.sleep(3000);
    	
    	driver.findElement(signupbutton).isEnabled();
    	driver.findElement(signupbutton).click();
    	
    	Thread.sleep(3000);
    	
    	logger.debug("Welcome Page Signup Process Completed");
    	
    	if(driver.getTitle().equals("Welcome"))
    		page = new FbWelcomePage();
    	   	
    	return page;
    		
    	
    	
    	
    }
    
    public FbWelcomePage signin( String emailid, String password) throws InterruptedException
    {
    	FbWelcomePage signinpage=null;
    	
    	logger.debug("Signin Facebok Page");
    	
    	driver.findElement(signinemail).clear();
    	driver.findElement(signinemail).sendKeys(emailid);
    	Thread.sleep(3000);
    	
    	driver.findElement(signinpwd).clear();
    	driver.findElement(signinpwd).sendKeys(password);
    	Thread.sleep(3000);
    	
    	driver.findElement(signin).isEnabled();
    	driver.findElement(signin).click();
    	Thread.sleep(3000);
    	
    	driver.navigate().forward();
    	FbWelcomePage wp=PageFactory.initElements(driver, FbWelcomePage.class);
    	
    	driver.findElement(navigation).click();
    	Actions maction=new Actions(driver);
    	maction.moveToElement((WebElement) navigation).click().build().perform();
    	
    	logger.debug("Sigin Complete");
    	if(driver.getTitle().equals("Welcome to Facebook"))
       	 signinpage = new FbWelcomePage();
       	
       	return signinpage;
    	   	
    }
    
    public getFbPage signout() throws InterruptedException
    {
    	getFbPage mainpage=null;
    	
    	driver.findElement(logout);
    	Actions mact=new Actions(driver);
    	mact.moveToElement((WebElement) logout).click().build().perform();
    	Thread.sleep(1000);
    	
    	logger.debug("Signout Complete");
    	if(driver.getTitle().equals("Main Page"))

          mainpage= new getFbPage();
    	
    	  return mainpage;
    	
    	
    }
    
}
