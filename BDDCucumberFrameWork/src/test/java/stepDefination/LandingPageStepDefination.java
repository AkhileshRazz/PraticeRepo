package stepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtilities.LandingPage;
import genericUtilities.TestContextSetup;
import io.cucumber.java.en.*; 
public class LandingPageStepDefination {

	
	 public WebDriver driver;
	  public String landingPageProductName;
	  public String offerpageProductName;
	public  TestContextSetup testContextSetup;
public LandingPageStepDefination(TestContextSetup testContextSetup) {
	this.testContextSetup= testContextSetup;
}
	
	@Given("User is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page() {
	   System.out.println("Hello");
	  
	}
	@When("user searched with shortName {string} and extract actual name of product")
	public void user_searched_with_short_name_and_extract_actual_name_of_product(String shortName) throws Throwable {
		LandingPage lp = testContextSetup.pageObjectManager.getLandingPage();
		lp.SearchItem(shortName);
		Thread.sleep(2000);
		lp.getSearchProductName().split("-")[0].trim();
		
	
		System.out.println("productname----"+testContextSetup.landingPageProductName);
	}
	
	
	
	

}
