package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {
	
	public void elementToBeClicked(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void presenceOfElementLocated(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.presenceOfElementLocated((By)element));
	}
	public void alertIsPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.alertIsPresent());
	}
	public void frameToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	public void rename(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfElementLocated((By)element));
	}

}
