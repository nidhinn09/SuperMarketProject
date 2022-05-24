package executeClass;

import org.testng.annotations.Test;


import elementRepository.LoginPage;
import elementRepository.ManagePage;

import java.awt.AWTException;

import org.testng.Assert;


public class ExecuteMangePage extends BaseClass {
	LoginPage lp;
	ManagePage mp;
	@Test(priority=0)
	public void verifyTheMoreInfoIsClickableOrNotInManagePageList() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		String expectedURL= "List Pages";
		String actualURL= mp.listPageDisplay();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test(priority=1)
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
	@Test(priority=2)
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
	@Test(priority=3)
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
	@Test(priority=4)
	public void verifyTheMangePageToHomePage() {
		lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		mp = new ManagePage(driver);
		mp.manageMoreinfo();
		mp.homePage();
		String expectedResult="Admin";
		String actualResult=mp.homePageDisplay();
		Assert.assertEquals(actualResult, expectedResult);
	}
	


}
