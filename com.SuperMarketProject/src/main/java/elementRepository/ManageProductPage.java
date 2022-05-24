package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class ManageProductPage {
	
	WebDriver driver; 
	GeneralUtilities gl= new GeneralUtilities();
	ExplicitWaitClass ew;
	
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-product'])[2]")
	WebElement moreInfoInManageProduct;
	@FindBy(xpath = "(//*[text()='List Products'])[1]")
	WebElement listProduct;
	@FindBy(xpath = "//*[@href='http://groceryapp.uniqassosiates.com/admin/Product/add']")
	WebElement newButton;
	@FindBy(xpath = "(//*[@class=' fa fa-search'])[1]")
	WebElement searchicon;
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	WebElement enterSearchTitle;
	@FindBy(xpath = "(//*[@class='form-control selectpicker'])[1]")
	WebElement dropdownSearchCategory;
	@FindBy(xpath = "(//*[@class='form-control selectpicker'])[2]")
	WebElement dropdownSearchSubCategory;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement valueSearchButton;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement productName;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[9]")
	WebElement editButtonInProduct;
	@FindBy(xpath = "(//*[@href='http://groceryapp.uniqassosiates.com/admin/home'])[4]")
	WebElement homeLink;
	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	WebElement homePage;
	
	public ManageProductPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void moreInfoManageProduct() {
		gl.clickElement(moreInfoInManageProduct);
	}
	public Boolean isNewButtoninManageProductEnable() {
		return gl.isEnabled(newButton);
	}
	public Boolean isSearchButtonInManageProductEnable() {
		return gl.isEnabled(searchicon);
	}
	public void searchicon() {
		gl.clickElement(searchicon);
	}
	public void enterTitleSearch(String value) {
		gl.enterValues(enterSearchTitle, value);
	}
	public void categoryProduct(int value) {
		gl.dropDownSelectByIndex(dropdownSearchCategory, value);
	}
	public void subCategoryProduct(int value) {
		gl.dropDownSelectByIndex(dropdownSearchSubCategory, value);
	}
	public void productSearchButton() {
		gl.clickElement(valueSearchButton);
	}
	public void expicitWait() {
		ew.presenceOfElementLocated(driver, newButton);
	}
	public String getValue() {
		return gl.getValues(productName);
	}
	public String getValueListProduct() {
		return gl.getValues(listProduct);
	}
	public String getValueHomePage() {
		return gl.getValues(homePage);
	}
	public Boolean editProduct() {
		return gl.isEnabled(editButtonInProduct);
	}
	public void homeLink() {
		gl.clickElement(homeLink);
	}
	

	

}
