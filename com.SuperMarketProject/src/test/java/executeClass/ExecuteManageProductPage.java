package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageProductPage;


public class ExecuteManageProductPage extends BaseClass {
	LoginPage lp;
	DashboardPage dp;
	ManageProductPage mpd;

	@Test(priority=0)
	public void verifyTheMoreInfoIsClickableOrNotInManageProductList() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		String expectedURL ="List Products";
		String actualURL = mpd.getValueListProduct();
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
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		Boolean actual=mpd.isNewButtoninManageProductEnable();
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
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		Boolean actual=mpd.isSearchButtonInManageProductEnable();
		Assert.assertTrue(actual);
	}
	@Test(priority=3)
	public void verifyTheSearchProduct() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		mpd.searchicon();
		mpd.enterTitleSearch("apple ");
		mpd.categoryProduct(1);
		//mpd.subCategoryProduct(2);
		mpd.productSearchButton();
		String expectedValue= "apple";
		String actualValue= mpd.getValue();
		Assert.assertEquals(actualValue, expectedValue);


	}
	@Test(priority=4)
	public void isEditButtonInProduct(){
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		Boolean actual=mpd.editProduct();
		Assert.assertTrue(actual);
		
		
	}
	@Test(priority=5)
	public void VerifyTheManageProductToHomePage() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		mpd.homeLink();
		String expected="Dashboard";
		String actual=mpd.getValueHomePage();
		Assert.assertEquals(actual, expected);
		
	}

}
