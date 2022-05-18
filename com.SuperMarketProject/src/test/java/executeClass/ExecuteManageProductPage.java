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
		String expectedURL ="http://groceryapp.uniqassosiates.com/admin/list-product";
		String actualURL = driver.getCurrentUrl();
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
		mpd.enterTitleSearch("Maggi Noodle P833 Combo");
		mpd.categoryProduct(3);
		//mpd.subCategoryProduct(88);
		mpd.productSearchButton();
		String expectedValue= "Maggi Noodle P833 Combo";
		String actualValue= mpd.getValue(); Assert.assertEquals(actualValue, expectedValue);


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
		String expectedURL="http://groceryapp.uniqassosiates.com/admin/home";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}
