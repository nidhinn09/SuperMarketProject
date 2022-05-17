package executeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import elementRepository.LoginPage;

public class BaseClass {
	WebDriver driver;
	public static Properties property;
	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties");
		property.load(fs);
	}
	@BeforeMethod
	public void beforeMethod() throws IOException {
		readProperty();
		
		System.setProperty(property.getProperty("ChromeSystemPropety"),System.getProperty("user.dir")+property.getProperty("ChromeDriverPath"));
		driver = new ChromeDriver();
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}


}
