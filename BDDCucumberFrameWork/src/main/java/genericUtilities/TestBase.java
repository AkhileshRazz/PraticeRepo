package genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver webdriverManager() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/propertyFile.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("QAUrl");
		
		if(driver==null) {
			if(p.getProperty("browser").equalsIgnoreCase("chrome") ){
		 driver=new ChromeDriver();
			}else if(p.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
		
		 driver.get(url);
		}
		return driver;

	}
}
