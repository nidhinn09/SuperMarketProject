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
		String actualResult= "Manage Pages";
		String expectedResult=dp.userDashBoard();
		Assert.assertEquals(actualResult, expectedResult);  
	  
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
	    String expectedResult ="7rmart supermarket";
		String actualResult = dp.loginPage(); 
		Assert.assertEquals(actualResult,expectedResult);
		 
	  
  }
  

}
