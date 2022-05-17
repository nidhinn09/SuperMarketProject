package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;



public class ExecuteDashboardPage extends BaseClass {
	LoginPage lp;
	DashboardPage dp;
  @Test(priority = 0)
  public void isDashboardPageDisplayed() {
	  lp = new LoginPage(driver);
	  lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp = new DashboardPage(driver);
		String actual= "Manage Pages";
		String expected=dp.text.getText();
		Assert.assertEquals(actual, expected);  
	  
  }
  @Test(priority = 1)
  public void verifyTheLogut() {
	  lp = new LoginPage(driver);
	  lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp = new DashboardPage(driver);
		dp.adminLinkclick();
		dp.explicitWait();
		dp.logOutClick();
	    String expectedURL ="http://groceryapp.uniqassosiates.com/admin/login";
		String actualURL = driver.getCurrentUrl(); 
		Assert.assertEquals(actualURL,expectedURL);
		 
	  
  }
  

}
