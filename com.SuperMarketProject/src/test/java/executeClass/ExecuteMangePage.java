package executeClass;

import org.testng.annotations.Test;


import elementRepository.LoginPage;
import elementRepository.ManagePage;

import java.awt.AWTException;

import org.testng.Assert;


public class ExecuteMangePage extends BaseClass {
	LoginPage lp;
	ManagePage mp;
	@Test(enabled = false)
	public void verifyTheMoreInfoIsClickableOrNotInManagePageList() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		String expectedURL= "http://groceryapp.uniqassosiates.com/admin/list-page";
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test(enabled = false)
	public void isNewButtonDisplayed() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		boolean actual= mp.newButton();
		Assert.assertTrue(actual);

	}
	@Test(enabled = false)
	public void isSearchFunctionalityWorkingFineOrNot() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		mp.searchIconClick();
		mp.EnterSearch("Brand Name");
		String actualResult ="Brand Name";
		String expectedResult = mp.searchName.getText();
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test(enabled = false)
	public void isafterUpdateAlertMessage() throws InterruptedException{
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		mp.editButtonInPageList();
		/* mp.explicityWait(); */
		mp.scrollDown();
		mp.threadSleep();
		mp.updateButton();
		Boolean actual = mp.alertMessage();
		Assert.assertTrue(actual);
	}
	@Test(enabled = false)
	public void verifyTheMangePageToHomePage() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		mp.homePage();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin/home";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
	}
	


}
