package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import base.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;
import utils.GenericUtils;

public class AdminPageStepDefination extends BasePage {

	@When("^create System user (.+)$")
	public void create_system_user(String username) throws Throwable {
		
		AdminPage admin = new AdminPage();
		GenericUtils utils = new GenericUtils();
		driver.findElement(admin.btnAdd).click();
		
		
		utils.selectOptionInDropDown(admin.ddUserRole , "ESS");
		utils.selectOptionInDropDown(admin.ddStatus , "Enabled");
		
		driver.findElement(admin.txtPassword1).sendKeys("Welcome@123456");
		driver.findElement(admin.txtPassword2).sendKeys("Welcome@123456");
		driver.findElement(admin.txtEmpName).sendKeys(username);
		
	}

	@Then("^user should create successfully$")
	public void user_should_create_successfully() throws Throwable {
		
		Thread.sleep(5000);
	}

}
