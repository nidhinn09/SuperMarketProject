package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class DashboardPage {
	
	WebDriver driver; 
	
	  GeneralUtilities gl= new GeneralUtilities();
	  ExplicitWaitClass ew= new ExplicitWaitClass();
	  
	  @FindBy(xpath = "(//a[@class='nav-link'])[2]")
	  WebElement admin;
	  @FindBy(xpath = "(//a[contains(@href,'http://groceryapp.uniqassosiates.com')])[33]")
	  WebElement managepage;
	public @FindBy(xpath = "(//*[text()='Manage Pages'])[2]")
	  WebElement text;
	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	WebElement adminLink;
	@FindBy(xpath = "(//*[@href='http://groceryapp.uniqassosiates.com/admin/logout'])[1]")
	WebElement logOut;
	
	  
	  public DashboardPage(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }

		
		  public void adminLinkclick(){
			  gl.clickElement(adminLink);
			  }
		 public void logOutClick() {
			 gl.clickElement(logOut);
		 }
		  
		  
		 
	  public void explicitWait() {
		  ew.elementToBeClicked(driver, logOut);
		
	}
	 /* public void adminDropdown(String value) {
		  gl.dropdownSelectByValue(adminLink, value);
	  }*/
	  
	  
	  
}
