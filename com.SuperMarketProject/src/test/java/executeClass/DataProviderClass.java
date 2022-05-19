package executeClass;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
 

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "admin123" },
      new Object[] { "admin123", "admin" },
      new Object[] { "admin123", "admin123" },
      
    };
  }
}
