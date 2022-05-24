package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWaitClass;
import utilities.GeneralUtilities;

public class ManageOfferCodePage {
	WebDriver driver; 
	GeneralUtilities gl= new GeneralUtilities();
	ExplicitWaitClass ew;
	
	@FindBy(xpath = "//*[@href='http://groceryapp.uniqassosiates.com/admin/list-offercode']")
	WebElement moreInfoInManageOfferCodePage;
	@FindBy(xpath="//*[@href='http://groceryapp.uniqassosiates.com/admin/Offercode/add']")
	WebElement newButtonInManageOfferCodePage;
	@FindBy(xpath = "//*[@href='javascript:void(0)']")
	WebElement searchButtonInManageOfferCodePage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[6]")
	WebElement editListOffer;
	@FindBy(xpath = "(//a[@href='http://groceryapp.uniqassosiates.com/admin/home'])[4]")
	WebElement home;
	@FindBy(xpath = "(//*[text()='List Offercodes'])[1]")
	WebElement ManageOfferCodePage;
	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	WebElement homePage;
	public ManageOfferCodePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void moreInfoManageOfferCode() {
		gl.clickElement(moreInfoInManageOfferCodePage);
	}
	public Boolean newButtonInManageOfferCode() {
		return gl.isEnabled(newButtonInManageOfferCodePage);
	}
	public Boolean  searchButtonInManageOfferCode() {
		return gl.isEnabled(searchButtonInManageOfferCodePage);
	}
	public void homeLink() {
		gl.clickElement(home);
	}
	public String getValue() {
		return gl.getValues(ManageOfferCodePage);
	}
	public String getValue1() {
		return gl.getValues(homePage);
	}

}
