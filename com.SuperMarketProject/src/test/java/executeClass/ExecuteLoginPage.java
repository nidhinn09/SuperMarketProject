package executeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;



public class ExecuteLoginPage extends BaseClass {
	LoginPage lp;
	
	@Test(priority=0)
	public void verifyThecheckBox() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("admin");
		lp.clickSignInButton();
		lp.implicitWait();
		boolean actual= lp.remembermeSelectedOrNot();
		
		
		Assert.assertTrue(actual);
		
	}
	
	@Test(priority=1)
	public void verifyTheSuccessfulLogin() throws IOException {
		lp= new LoginPage(driver);
		lp.enterUsername(lp.readUserName(0, 1));
		lp.enterPassword(lp.readPassword(1, 1));
		lp.clickSignInButton();
		lp.implicitWait();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	@Test(priority= 2)
	public void verifyTheInvalidUserNameAndInvalidPassword() throws IOException {
		lp= new LoginPage(driver);
		lp.enterUsername(lp.readUserName(0, 2));
		lp.enterPassword(lp.readPassword(1, 2));
		lp.clickSignInButton();
		lp.implicitWait();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test(priority= 3)
	public void verifyTheValidUserNameAndInvalidPassword() {
		lp= new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterPassword("capital");
		lp.clickSignInButton();
		lp.implicitWait();
		String expectedURL="http://groceryapp.uniqassosiates.com/admin";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	

	
}
