package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failed_scenarios.txt",
		glue = "stepDefinations",
		monochrome = true,
		dryRun = false,
		tags="@HRM",
		plugin = {"html:target/cucumber.html", "json:target/cucumber.json",  // To create HTML report
			//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // To create extent report
			"rerun:target/failed_scenarios.txt"	
		}  
		
		)
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	/*
	// To run test cases  in parallel mode
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
*/
}
	
