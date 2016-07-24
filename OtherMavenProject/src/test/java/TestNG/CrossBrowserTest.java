package TestNG;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CrossBrowserTest {
	
	String url="http://www.orbitz.com";
	String node = "http://vinzy16:4c889904-bb10-4aa7-8887-02fff267e974@ondemand.saucelabs.com:80/wd/hub";
	String name ="abc_1234";
	WebDriver driver;
	
	
 @Parameters({"browserType", "env"})		
  @BeforeClass
  public  void beforeClass( String browserType, String env) {
	 
	 DesiredCapabilities cap = null;	
	 if(browserType.equals("Firefox"))
	 {
	 cap=DesiredCapabilities.firefox();
	 cap.setBrowserName("firefox");
	
  }
	 else if(browserType.equals("Chrome"))
	 {
		 cap=DesiredCapabilities.chrome();
		 cap.setBrowserName("Chrome");
	 }
	 
	 if(env.equals("MAC"))
	 
		 cap.setPlatform(Platform.MAC);
	 else
		 cap.setPlatform(Platform.WINDOWS);
	 
	 Random r=new Random(1000);
	 name=name+ r.nextLong();
	 
	 cap.setCapability("name", name);  //Parallel Execution	
 }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  
  @Test
  public void f() {
	  
	  String title=driver.getTitle();
	  
	  System.out.println(title);
  }

}
