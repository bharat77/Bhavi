package TestNG;

import org.testng.annotations.Test;

public class DependTest {
	
	public int result;
	
  @Test
  public void registration() {
	System.out.println("Registration done");
	result= 0;
	  
  }
  
  @Test(dependsOnMethods ={"registration"}, alwaysRun=true)
  public void login() {
	  
	  if(result==0)
	System.out.println("Login done");

	  
  }
  
  
  
}
