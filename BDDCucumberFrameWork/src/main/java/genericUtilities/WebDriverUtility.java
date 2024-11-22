package genericUtilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {

	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchWindowToChild() {
		 Set<String> s1 = driver.getWindowHandles();
		   Iterator<String> it = s1.iterator();
		   it.next();
		   driver.switchTo().window(it.next());
	}
}
