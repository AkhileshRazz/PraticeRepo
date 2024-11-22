package stepDefination;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;

import PomUtilities.LandingPage;
import PomUtilities.OfferPages;
import genericUtilities.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefination {
//Global Variable	
	  public String offerpageProductName;
	  TestContextSetup testContextSetup;
	  OfferPages op = new OfferPages(testContextSetup.driver);
	  LandingPage lp =new LandingPage(testContextSetup.driver);
	  

	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	public void switchToOffersPage() {
		testContextSetup.webdriverUtility.switchWindowToChild();
	}
	
	
	@Then("user searched for same shortName {string} in offerpage to check if the product exist")
	public void user_searched_for_same_short_name_in_offerpage_to_check_if_the_product_exist(String shortName) throws Throwable {
				
		//lp.clickOnTopDeal();
		testContextSetup.pageObjectManager.getLandingPage();
		switchToOffersPage();
		  		op.SearchItem(shortName);
		   Thread.sleep(2000);
		 op.getSearchProductName(); 
	}
	
	@Then("validate product name in offerpage matches with Landing page")
	public void validate_product_name_in_offerpage_matches_with_landing_page() {
		Assert.assertEquals(offerpageProductName,testContextSetup.landingPageProductName);
		testContextSetup.driver.close();
		testContextSetup.driver.quit();
	}
}
