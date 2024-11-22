package cucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                 glue = "stepDefination",
                 monochrome = true
		)
public class TestNgrunners extends AbstractTestNGCucumberTests {

}
