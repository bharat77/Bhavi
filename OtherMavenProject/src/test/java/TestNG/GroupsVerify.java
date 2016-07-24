package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupsVerify {
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(groups={"Wells Fargo", "Transaction"})
  public void deposit() {
	  System.out.println("Money depositing");
  }

  @Test(groups={"Chase", "Transaction"})
  public void withrawl() {
	  
	  System.out.println("Money  Withdrawal");
  }
  
  @Test(groups={"BB&T", "Activity"})
  public void checking() {
	  
	  System.out.println("checking balance");
  }
  
  @Test
  public void internetlogin() {
	  
	  System.out.println("Internet Activity");
  }
  
}
