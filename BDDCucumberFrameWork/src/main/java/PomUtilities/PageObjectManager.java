package PomUtilities;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
//Global Variable	
	public LandingPage landingPage;
	public WebDriver driver;
	
//constructor	
 public PageObjectManager(WebDriver driver) {
	 this.driver=driver;
 }
 
//method	
	public LandingPage getLandingPage() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPages offerPage() {
		OfferPages op=new OfferPages(driver);
		return op;
		
	}
	
}
