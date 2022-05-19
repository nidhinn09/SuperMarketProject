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

	@Test(enabled = false)
	public void verifyTheMoreInfoIsClickableOrNotInManageProductList() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		dp =new DashboardPage(driver);
		mpd = new ManageProductPage(driver);
		mpd.moreInfoManageProduct();
		String expectedURL ="http://groceryapp.uniqassosiates.com/admin/list-product";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(enabled = false)
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
	@Test(enabled = false)
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
	@Test(priority=0)
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
	@Test(enabled = false)
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
	@Test(enabled = false)
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
		String expectedURL="http://groceryapp.uniqassosiates.com/admin/home";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}
