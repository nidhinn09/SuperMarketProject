package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.CategoryPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ExecuteCategoryPage extends BaseClass {
	LoginPage lp;
	DashboardPage dp;
	CategoryPage cp;
	
  @Test(priority = 0)
  public void verifyTheMoreInfoIsClickableOrNotInCategoryPageList() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		String expected ="List Categories";
		String actual = cp.getCategoryListValue();
		Assert.assertEquals(actual, expected);
  }
  @Test(priority = 1)
  public void isNewButtonEnable() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		Boolean actual= cp.newButtonEnable();
		Assert.assertTrue(actual);
	  
  }
  @Test(priority = 2)
  public void isSearchButtonEnable() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		cp.explicitWait();
		Boolean actual=  cp.searchButtonEnable();
		Assert.assertTrue(actual);  
  }
  @Test(priority = 3)
  public void isSearchFunctionalityWorkingFineOrNot() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		cp.searchButtonClick();
		cp.searchValue("seafood");
		String expectedValue=cp.getSearchValue();
		String actualValue= "seafood";
		Assert.assertEquals(actualValue, expectedValue);
  }
  @Test(priority = 4)
  public void isSearchValueActiveEnable() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		Boolean actual= cp.activeButtonEnable();
		Assert.assertTrue(actual);
	  
  }
  @Test(priority = 5)
  public void verifyTheCategoryToHomePage() {
	  lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		cp = new CategoryPage(driver);
		cp.moreInfoOfCategoryPage();
		cp.homePage();
		String expected="Dashboard";
		String actual=cp.home();
		Assert.assertEquals(expected, actual);
	  
  }
}
