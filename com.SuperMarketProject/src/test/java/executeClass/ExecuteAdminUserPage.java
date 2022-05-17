package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.AdminUserPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ExecuteAdminUserPage extends BaseClass {
	
	LoginPage lp;
	DashboardPage dp;
	AdminUserPage ap;
	
  @Test(priority = 0)
  public void isNewButtonDisplayed() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		ap = new AdminUserPage(driver);
		ap.moreInfoInAdminUser();
		Boolean actual= ap.newButtonDisplay();
		Assert.assertTrue(actual);	
  }
  
  @Test(priority = 1)
  public void verifyAddTheNewAdminUser() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		ap = new AdminUserPage(driver);
		ap.moreInfoInAdminUser();
		ap.explicitWait();
		ap.newButtonClick();
		ap.enterValueUserName("Robert");
		ap.enterValuePassword("123");
		ap.selectUserType("staff");
		ap.clickInSave();
		String exceptedResult = "Robert";
		String actualResult = ap.getNewAdminName();
		Assert.assertEquals(actualResult, exceptedResult);
	  
  }
  @Test(priority = 2)
  public void isSearchButtonEnable() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		ap = new AdminUserPage(driver);
		ap.moreInfoInAdminUser();
		Boolean actual =  ap.searchButtonEnable();
		Assert.assertTrue(actual);
	  
  }
  @Test(priority = 3)
  public void  isActiveButtonEnable(){
	        lp= new LoginPage(driver);
			lp.enterUsername("admin");
			lp.enterPassword("admin");
			lp.clickSignInButton();
			lp.implicitWait();
			dp =new DashboardPage(driver);
			ap = new AdminUserPage(driver);
			ap.moreInfoInAdminUser();
			Boolean actual= ap.isaActiveButtonEnable();
			Assert.assertTrue(actual);
	  
  }
}
