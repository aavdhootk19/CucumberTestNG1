package stepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class LandingPageStepDefination extends BasePage {

	public String landingPageProductName;
	public String offerPageProductName;
				  	
	TestContextSetup testContextSetup;

	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("User is on GreenKart Page")
	public void user_is_on_green_kart_page() throws IOException {

	//	WebDriverManager.chromedriver().setup();
	//	driver = new ChromeDriver();
		driver.get(GenericUtils.getDataFromProperty("QAurl"));

	}

	@When("^user searched with Short name (.+) and extract actual name of product$")
	public void user_searched_with_short_name_and_extract_actual_name_of_product(String searchOption)
			throws InterruptedException {
		LandingPage landingPage = new LandingPage();
		
		driver.findElement(landingPage.search).sendKeys(searchOption);
		Thread.sleep(5000);
		String data = driver.findElement(landingPage.productName).getText();
		String splitWord[] = data.split("-");

		offerPageProductName = splitWord[0].trim();
		System.out.print("Actual Product name ***********************  " + offerPageProductName);

	}
	
	

	
	@Then("close the bwoser")
	public void close_the_bwoser() {
		driver.close();
		driver.quit();
		
	}



}
