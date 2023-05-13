package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/magneto.feature", glue = "stepDefinations",

dryRun = false,
tags = "@magneto1", monochrome = true, plugin = {
		"html:target/cucumber.html", "json:target/cucumber.json", // To create HTML report
		// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // To
		// create extent report
		"rerun:target/failed_scenarios.txt"

}

)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {


	  @Override
	  
	  @DataProvider(parallel=true) public Object[][] scenarios() { return
	  super.scenarios(); }
	 
}
