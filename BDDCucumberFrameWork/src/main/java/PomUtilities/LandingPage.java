package PomUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	By searchtextfield=By.xpath("//input[@type='search']");
	By productName=By.xpath("//div[@class='product']/h4");
	By topDeal=By.linkText("Top Deals");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public void SearchItem(String name) {
		driver.findElement(searchtextfield).sendKeys(name);
	}
	
	public String getSearchProductName() {
		return driver.findElement(productName).getText();
	}
	public void clickOnTopDeal() {
		driver.findElement(topDeal);
	}

}
