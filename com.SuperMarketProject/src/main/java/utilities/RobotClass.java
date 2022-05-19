package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;


public class RobotClass {

	public static Robot rb;
	public static StringSelection filePath;

	public static void uploadFile() throws AWTException, InterruptedException {

		rb = new Robot();
		filePath = new StringSelection("D:\\superMarketProject\\com.SuperMarketProject\\src\\main\\resources\\Tomato_je.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_ENTER);


	}
}

