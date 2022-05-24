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
		lp.selectRememberme();
		boolean actual= lp.remembermeCheckboxSelectedOrNot();
		Assert.assertTrue(actual);


	}

	@Test(priority=1)
	public void verifyTheSuccessfulLogin() throws IOException {
		lp= new LoginPage(driver);
		lp.enterUsername(lp.readUserName(0, 1));
		lp.enterPassword(lp.readPassword(1, 1));
		lp.clickSignInButton();
		lp.implicitWait();
		String expectedResult="Admin";
		String actualResult = lp.userPage();
		Assert.assertEquals(actualResult, expectedResult);

	}
	@Test(priority=2,dataProvider = "data-provider",dataProviderClass = DataProviderClass.class)
	public void verifyUnsuccessfulLogin(String uName,String password){
		lp= new LoginPage(driver);
		lp.enterUsername(uName);
		lp.enterPassword(password);
		lp.clickSignInButton();
		lp.implicitWait();
		String expectedResult="Admin";
		String actualResult = lp.userPage();
		Assert.assertEquals(actualResult, expectedResult);
	}





}
