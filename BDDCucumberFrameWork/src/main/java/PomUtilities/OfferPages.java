package PomUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPages {
	
	public WebDriver driver;
	private By searchtextfield=By.xpath("//input[@type='search']");
	private By productName=By.cssSelector("tr td:nth-child(1)");
	
	public OfferPages(WebDriver driver) {
		this.driver=driver;
	}
	public void SearchItem(String name) {
		driver.findElement(searchtextfield).sendKeys(name);
	}
	
	public String getSearchProductName() {
		return driver.findElement(productName).getText();
	}

}
