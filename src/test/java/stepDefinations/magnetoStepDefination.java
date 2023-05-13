package stepDefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;

import cucumberOptions.TestNGTestRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MagnetoPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class magnetoStepDefination extends BasePage {

	TestContextSetup testContextSetup;

	public magnetoStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("^user Login to magneto$")
	public void user_login_to_magneto() throws Throwable {

		MagnetoPage magneto = new MagnetoPage();
		driver.get(GenericUtils.getDataFromProperty("magneto"));
		Thread.sleep(3000);
		driver.findElement(magneto.signIn).click();
		Thread.sleep(3000);
		driver.findElement(magneto.txtLoginEmail).sendKeys(GenericUtils.getDataFromProperty("magnetoUsername"));
		driver.findElement(magneto.txtPassword).sendKeys(GenericUtils.getDataFromProperty("magnetoPassword"));
		driver.findElement(magneto.btnSignIn).click();
		
	}

	@Given("^user navigate to magneto$")
	public void user_navigate_to_magneto() throws Throwable {
		
		driver.get(GenericUtils.getDataFromProperty("magneto"));

	}

	@Then("^user open menu (.+) and (.+)$")
	public void user_open_menu_and(String menu, String submenu) throws Throwable {
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='store.menu']//*[text()='" + menu + "']"))).build()
				.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='store.menu']//*[text()='" + submenu + "']")).click();
	}

	@And("^user select the product$")
	public void user_select_the_product() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(4000);
		driver.findElement(magneto.firstProduct).click();

	}

	@And("^user add product in cart$")
	public void user_add_product_in_cart() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(3000);
		driver.findElement(magneto.addToCart).click();
		Thread.sleep(5000);

		Assert.assertTrue(driver.findElement(magneto.lblAddToCartMesg).getText().contains("You added"));

	}
	

    
    @And("^user add product in cart with quantity (.+)$")
    public void user_add_product_in_cart_with_quantity(String qty) throws Throwable {
    	MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(3000);
		driver.findElement(magneto.txtQty).click();
		
		Thread.sleep(2000);
		driver.findElement(magneto.txtQty).sendKeys(Keys.NUMPAD1);
		driver.findElement(magneto.addToCart).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(magneto.lblAddToCartMesg).getText().contains("You added"));
    
    }
	

	@Then("^user should add product to wishlist$")
	public void user_should_add_product_to_wishlist() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		driver.findElement(magneto.btnAddToWishList).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(magneto.lblWishListMesg).getText()
				.contains("Push It Messenger Bag has been added to your Wish List"));

	}

	@When("^user search for product (.+)$")
	public void user_search_for_product(String product) throws Throwable {
		testContextSetup.product = product;
		MagnetoPage magneto = new MagnetoPage();
		driver.findElement(magneto.searchProduct).sendKeys(product, Keys.ENTER);
		Thread.sleep(3000);

	}

	@Then("^product should display$")
	public void product_should_display() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(magneto.productList));
		Assert.assertTrue(driver.findElement(magneto.productList).isDisplayed());
	}

	@Then("^user should able to add product in compare$")
	public void user_should_able_to_add_product_in_compare() throws Throwable {

		MagnetoPage magneto = new MagnetoPage();
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(magneto.btnCompareProduct));
		Thread.sleep(5000);

	}

	@When("^user perform advane search with SKU id (.+)$")
	public void user_perform_advane_search_with_sku_id(String sku) throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(magneto.linkAdvanceSearch));
		driver.findElement(magneto.linkAdvanceSearch).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(magneto.txtSku));
		driver.findElement(magneto.txtSku).sendKeys(sku);
		driver.findElement(magneto.btnSearch).click();

	}

	@Then("^user complete email (.+) subscription process$")
	public void user_complete_email_subscription_process(String email) throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		driver.findElement(magneto.txtSubscribeEmail).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(magneto.btnSubscribe).click();
		Thread.sleep(5000);
		Assert.assertTrue(
				driver.findElement(magneto.lblSubscriptionMsg).getText().contains("Thank you for your subscription."));
	}

	@Then("^verify aboutus page$")
	public void verify_aboutus_page() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		driver.findElement(magneto.linkAboutUs).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().toString()
				.equalsIgnoreCase("https://magento.softwaretestingboard.com/about-us"));
	}

	@When("^user remove product from cart$")
	public void user_remove_product_from_cart() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(3000);

		WebElement m = driver.findElement(magneto.btnShowCart);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);

		Thread.sleep(3000);
		driver.findElement(magneto.viewAndEditCart).click();
		Thread.sleep(3000);
		driver.findElement(magneto.removeProductFromCart).click();

	}

	@Then("^product should remove from cart successfully$")
	public void product_should_remove_from_cart_successfully() throws Throwable {
		MagnetoPage magneto = new MagnetoPage();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(magneto.lblProductIsrRemoved).getText()
				.contains("You have no items in your shopping cart."));
	}

	@When("^user create account with (.+) , (.+) and (.+)$")
	public void user_create_account_with_and(String firstname, String lastname, String password) throws Throwable {
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));

		MagnetoPage magneto = new MagnetoPage();
		wait.until(ExpectedConditions.visibilityOfElementLocated(magneto.linkCreateAnAccount));
		driver.findElement(magneto.linkCreateAnAccount).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(magneto.txtFirstName));
		driver.findElement(magneto.txtFirstName).sendKeys(firstname);
		driver.findElement(magneto.txtLastName).sendKeys(lastname);
		driver.findElement(magneto.txtCreateAccountPassword).sendKeys(password);
		driver.findElement(magneto.txtConfirmPassword).sendKeys(password);
	//	int random = (int) Math.random() * 1000000;
		int rand = (int)(Math.random() * 100000) + 10;
		System.out.print("****** "+rand);
		driver.findElement(magneto.txtEmail).sendKeys("randon" + String.valueOf(rand) + "@gomail.com");
		driver.findElement(magneto.btnCreateAccount).click();

	}

	@Then("^page title should be My Account$")
	public void page_title_should_be_my_account() throws Throwable {

		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("My Account"));
		Assert.assertEquals(driver.getTitle().toString(), "My Account");
	}

	@When("^user search for the  product (.+) and add to compare$")
	public void user_search_for_the_product_and_add_to_compare(String product) throws Throwable {
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		testContextSetup.product = product;
		MagnetoPage magneto = new MagnetoPage();
		driver.findElement(magneto.searchProduct).sendKeys(product, Keys.ENTER);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(magneto.linkProductName));
		List<WebElement> productName = driver.findElements(magneto.linkProductName);
		for (WebElement E : productName) {
			if (E.getText().trim().equalsIgnoreCase(product)) {
				wait.until(ExpectedConditions.elementToBeClickable(E));
				E.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(magneto.btnCompareProduct));
		driver.findElement(magneto.btnCompareProduct).click();

	}

	@Then("^verify compare page product name$")
	public void verify_compare_page_product_name() throws Throwable {

		MagnetoPage magneto = new MagnetoPage();
		WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(magneto.linkCompareProduct));
		driver.findElement((magneto.linkCompareProduct)).click();
		wait.until(ExpectedConditions.titleContains("Products Comparison List") );

		Assert.assertTrue(driver.getTitle().toString().contains("Products Comparison List"));

	}
	
    @When("^user add multiple products in cart$")
    public void user_add_multiple_products_in_cart(DataTable table) throws Throwable {
    	List<String> data = table.row(0);
    	WebDriverWait wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
    	for(String product: data)
    	{
    	MagnetoPage magneto = new MagnetoPage();
    	wait.until(ExpectedConditions.presenceOfElementLocated(magneto.searchProduct));
    	
    	driver.findElement(magneto.searchProduct).sendKeys(product, Keys.ENTER);
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]"))));
		
		driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(magneto.addToCart));
		driver.findElement(magneto.addToCart).click();
		
		 
    	}
    
    	Assert.fail();
    }
    
    

}
