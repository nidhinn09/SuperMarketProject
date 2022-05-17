package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	public void enterValues(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	public String getValues(WebElement element) {
		return element.getText();	
	}
	public  void dropDownSelectByIndex(WebElement element, int value) {
	      Select drop = new Select(element);
	      drop.selectByIndex(value);  
	}
	public void dropdownSelectByValue(WebElement element, String  value) {
		Select drop = new Select(element);
		drop.selectByValue(value);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	public Boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}
	public Boolean elementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void scrollingDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	public void addThreadSleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	public void addImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
