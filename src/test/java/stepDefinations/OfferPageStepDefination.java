package stepDefinations;

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
import pageObjects.OffersPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class OfferPageStepDefination extends BasePage {

	TestContextSetup testContextSetup;

	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

    @Then("^user search for same shortname \"([^\"]*)\" in offers page to check if product exist$")
    public void user_search_for_same_shortname_something_in_offers_page_to_check_if_product_exist(String strArg1) throws Throwable {
       
    	
    }
    
    
    @Then("^user proceeds to checkout amd validate the (.+) items in checkout page$")
    public void user_proceeds_to_checkout_amd_validate_the_items_in_checkout_page(String name) throws Throwable {
        
    	
    	
    	
    	
    }


	
	
	@Then("^user search for same shortname (.+) in offers page to check if product exist$")
	public void user_search_for_same_shortname_in_offers_page_to_check_if_product_exist(String searchOption)
			throws InterruptedException {
		OffersPage offerPage = new OffersPage();
		GenericUtils.switchToOfferPage();
		Thread.sleep(5000);
		driver.findElement(offerPage.txtSearchField).sendKeys(searchOption);
		Thread.sleep(5000);
		testContextSetup.landingPageProductName = driver.findElement(offerPage.lblSearchResult).getText();

		Assert.assertEquals("data", "data");
	}
	

 

   

}
