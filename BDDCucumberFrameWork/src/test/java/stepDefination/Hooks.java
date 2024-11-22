package stepDefination;

import genericUtilities.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void afterScenario() throws Throwable {
		testContextSetup.testBase.webdriverManager().quit();
	}

}
