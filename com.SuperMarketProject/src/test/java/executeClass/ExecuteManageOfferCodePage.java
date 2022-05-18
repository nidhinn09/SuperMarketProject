package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageOfferCodePage;

public class ExecuteManageOfferCodePage extends BaseClass {
	LoginPage lp;
	DashboardPage dp;
	ManageOfferCodePage moc;
	
  @Test(priority=0)
  public void verifyTheMoreInfoIsClickableOrNotInManageOfferCode() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		moc = new ManageOfferCodePage(driver);
		moc.moreInfoManageOfferCode();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin/list-product";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
  }
  @Test(priority=1)
  public void isNewButtonEnable() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		moc = new ManageOfferCodePage(driver);
		moc.moreInfoManageOfferCode();
		Boolean actual=moc.newButtonInManageOfferCode();
		Assert.assertTrue(actual);
	  
  }
  @Test(priority=2)
  public void isSearchButtonEnable() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		moc = new ManageOfferCodePage(driver);
		moc.moreInfoManageOfferCode();
		Boolean actual=moc.searchButtonInManageOfferCode();
		Assert.assertTrue(actual);
	  
  }
  @Test(priority=3)
  public void VerifyTheManageProductToHomePage() {
	  lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		moc = new ManageOfferCodePage(driver);
		moc.moreInfoManageOfferCode();
		moc.homeLink();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin/home";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	  
  }
}
