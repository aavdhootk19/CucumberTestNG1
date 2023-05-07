package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;
import pageObjects.Login;
import utils.GenericUtils;

public class OrangeHRMStepDefination extends BasePage {

	@Given("^user login to Orange HRM$")
	public void user_login_to_orange_hrm() throws Throwable {

		Login login = new Login();

		login.loginOrangeHRM();
	}

	@When("^user click on Seach button$")
	public void user_click_on_seach_button() throws Throwable {
		AdminPage admin = new AdminPage();
		WebDriverWait wait = new WebDriverWait(BasePage.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(admin.btnSearch));
		driver.findElement(admin.btnSearch).click();
		
		
		
	}

	@Then("^employee records should display successfully$")
	public void employee_records_should_display_successfully() throws Throwable {
		AdminPage admin = new AdminPage();
		int size = 	driver.findElements(admin.employeeSearchtableRow).size();
		System.out.print("Number of employee " +size);
		Thread.sleep(5000);
	}

	@And("^user navigates to Admin page$")
	public void user_navigates_to_admin_page() throws Throwable {
		GenericUtils utils  = new GenericUtils();
		utils.gotoPage("Admin");
	}
	
	
    @Then("^failed the test case$")
    public void failed_the_test_case() throws Throwable {
       Assert.fail();
    }

}
