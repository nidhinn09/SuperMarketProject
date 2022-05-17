package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class CategoryPage {
	WebDriver driver; 
	GeneralUtilities gl= new GeneralUtilities();
	ExplicitWaitClass ew= new ExplicitWaitClass();
	
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-category'])[2]")
	WebElement moreInfoInCategoryPage;
	@FindBy(xpath = "//a[@href='http://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement newButtonInCategoryPage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButtonInCategoryPage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement searchValue;
	@FindBy(xpath = "//*[@class='form-control']")
	WebElement searchValueInCategoryPage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[3]")
	WebElement activButton;
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/home'])[1]")
	WebElement homePage;
	
	public CategoryPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moreInfoOfCategoryPage() {
		gl.clickElement(moreInfoInCategoryPage);
	}
	public Boolean newButtonEnable() {
		return gl.isEnabled(newButtonInCategoryPage);
	}
	public Boolean searchButtonEnable() {
		return gl.isEnabled(searchButtonInCategoryPage);
	}
	public void searchButtonClick() {
		gl.clickElement(searchButtonInCategoryPage);
	}
	public void searchValue(String value) {
		gl.enterValues(searchValueInCategoryPage, value);
	}
	public void explicitWait() {
		ew.elementToBeClicked(driver, searchButtonInCategoryPage);
	}
	public String getSearchValue() {
		return gl.getValues(searchValue);
		
	}
	public Boolean activeButtonEnable() {
		return gl.isEnabled(activButton);
	}
	public void homePage() {
		gl.clickElement(homePage);
	}

	

}
