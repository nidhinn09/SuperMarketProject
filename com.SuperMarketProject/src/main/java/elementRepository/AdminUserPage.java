package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class AdminUserPage {

	WebDriver driver; 
	GeneralUtilities gl= new GeneralUtilities();
	ExplicitWaitClass ew = new ExplicitWaitClass(); 

	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")
	WebElement moreInfoInAdminuser;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButtonInAdminUser;
	@FindBy(xpath = "//*[@id='username']")
	WebElement userNameInAdminUser;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInAdminUser;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement dropDownValue;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement addAdmin;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	WebElement saveBInUserType;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[3]")
	WebElement activeButtonInRobert;
	@FindBy(xpath = "//a[text()=' Search']")
	WebElement searchInAdminUser;


	public AdminUserPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void moreInfoInAdminUser() {
		gl.clickElement(moreInfoInAdminuser);
	}
	public Boolean newButtonDisplay(){
		return gl.isEnabled(newButtonInAdminUser);
	}
	public Boolean searchButtonEnable() {
		return gl.isEnabled(searchInAdminUser);
		
	}
	public Boolean isaActiveButtonEnable() {
			return gl.isEnabled(activeButtonInRobert);
	}
	
	public void newButtonClick() {
		gl.clickElement(newButtonInAdminUser);

	}
	public void enterValueUserName(String username) {
		gl.enterValues(userNameInAdminUser, username);
	}
	public void enterValuePassword(String pass) {
		gl.enterValues(passwordInAdminUser, pass);
	}
	public void selectUserType(String value) {
		gl.dropdownSelectByValue(dropDownValue, value);
	}
	public void clickInSave() {
		gl.clickElement(saveBInUserType);
	}
	public String getNewAdminName() {
		return gl.getValues(addAdmin);
	}
	public void explicitWait() {
		ew.elementToBeClicked(driver, newButtonInAdminUser);
	}
	
}
