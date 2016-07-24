package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.AfterClass;

public class TestNGParameterexample {
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Parameters {{"fname","lname","rollno"}}
  @Test
  public void studentrecords( String fname, String lname, int rollno) {
	  
	  System.out.println(fname+ " "+lname + " "+rollno);
  } 

}
