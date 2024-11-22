package genericUtilities;

import org.openqa.selenium.WebDriver;

import PomUtilities.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public WebDriverUtility webdriverUtility;
	public TestContextSetup() throws Throwable {
		testBase= new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webdriverManager());
		webdriverUtility=new WebDriverUtility(testBase.webdriverManager());
	}
}
