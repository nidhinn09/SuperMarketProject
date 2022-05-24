package elementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;
import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;
import utilities.RobotClass;

public class ManagePage {
	WebDriver driver; 
	GeneralUtilities gl= new GeneralUtilities();
	ExplicitWaitClass ew = new ExplicitWaitClass(); 
	RobotClass rb= new RobotClass();
	
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-page'])[2]")
	WebElement moreinfo;
	@FindBy(xpath = "(//*[text()='List Pages'])[1]")
	WebElement listpage;
	@FindBy(xpath = "//a[@href='http://groceryapp.uniqassosiates.com/admin/pages/add']")
	WebElement newButton;
	@FindBy(xpath = "//*[text()=' Search']")
	WebElement searchIcon;
	@FindBy(className = "form-control")
	WebElement title;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searchButton;
	public @FindBy(xpath = "//*[text()='Brand Name']")
	WebElement searchName;
	@FindBy(xpath = "(//*[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement editButton;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateIneditOfTheListPage;
	@FindBy(xpath = "//*[text()=' Alert!']")
	WebElement alertMessage;
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/home'])[1]")
	WebElement homePage;
	@FindBy(xpath="(//*[text()=' Admin'])[1]")
	WebElement Dashboard;
	@FindBy(xpath = "//*[@id='title']")
	WebElement NewValue;
	@FindBy(xpath = "//*[@id='page']")
	WebElement pageNew;
	@FindBy(xpath = "//*[@id='main_img']")
	WebElement chooseFile;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveButton;

	public ManagePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void manageMoreinfo() {
		gl.clickElement(moreinfo);
	}
	public String listPageDisplay() {
		return gl.getValues(listpage);
				}
	public boolean newButton() {
		return gl.elementDisplayed(newButton);
	}
	public void enterNewProduct() {
		gl.clickElement(newButton);
	}
	public void enterTitle(String value) {
		gl.enterValues(NewValue, value);
	}
	public void enterPage(String value) {
		gl.enterValues(pageNew, value);
	}
	public void fileSave() {
		gl.clickElement(saveButton);
	}
	
	public void searchIconClick() {
		gl.clickElement(searchIcon);
	}
	public void EnterSearch(String tit) {
		gl.enterValues(title,tit);
	}
	public Boolean clickSearchButton() {
		return gl.isEnabled(searchButton);
	}
	public void editButtonInPageList() {
		gl.clickElement(editButton);
	}
	public void scrollDown() {
		gl.scrollingDown(driver);
	}
	public void threadSleep() throws InterruptedException {
		gl.addThreadSleep();
	}
	public void updateButton() {
		gl.clickElement(updateIneditOfTheListPage);
	}
	public boolean alertDisplay() {
		return gl.elementDisplayed(alertMessage);
	}
	public void explicityWait() {
		ew.elementToBeClicked(driver, updateIneditOfTheListPage);
		
	}
	public Boolean alertMessage() {
		return gl.elementDisplayed(alertMessage);
	}
	public void homePage() {
		gl.clickElement(homePage);
	}
	public String homePageDisplay() {
		return gl.getValues(Dashboard);
	}
	

}
