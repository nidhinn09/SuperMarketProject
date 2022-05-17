package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelReadClass;
import utilities.GeneralUtilities;

public class LoginPage {
	
	  WebDriver driver; 
	  GeneralUtilities gl= new GeneralUtilities();
	  
	  @FindBy(name = "username") 
	  WebElement user;
	  @FindBy(name = "password") 
	  WebElement password;
	  @FindBy(xpath = "//label[@for='remember']")
	  WebElement rememberMe;
	  @FindBy(xpath = "//button[text()='Sign In']") 
	  WebElement signIn;
	  
	  public LoginPage(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void enterUsername(String name) {
		  gl.enterValues(user, name);
	  }
	  public void enterPassword(String pass) {
		  gl.enterValues(password, pass);
	  }
	  public boolean remembermeSelectedOrNot() {
		 return gl.isSelected(rememberMe);
	  }
	  public void clickSignInButton() {
		  gl.clickElement(signIn);
	  }
	  public void sleep() throws InterruptedException {
		  gl.addThreadSleep();
		
	}
	  public void implicitWait() {
		  gl.addImplicitWait(driver);
	  }
	  public String readUserName(int r, int c) throws IOException {
		  return ExcelReadClass.readStringData(r, c);
		  
	  }
	  public String readPassword(int r,int c) throws IOException {
		  return ExcelReadClass.readStringData(r, c);
	  }
	  
	 

}
