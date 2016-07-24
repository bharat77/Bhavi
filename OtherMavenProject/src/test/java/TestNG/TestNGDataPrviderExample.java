package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNGDataPrviderExample {
  

  @DataProvider(name="studata")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Ajay","Bharat","Vijay"},
      new Object[] { "Bhanu","Bhav","Vijay"},
    };
    
  }
    @Test(dataProvider = "studata")
    public void sturecord (String fname,String lname,String company)
    {
    	
    	System.out.println(fname+ " "+lname+ " "+company);
    }
    
  }

