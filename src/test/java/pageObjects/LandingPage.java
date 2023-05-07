package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class LandingPage extends BasePage {

	public By search = By.xpath("//*[@type='search']");
	public By productName = By.xpath("//h4[@class='product-name']");
	public By btnAddToCart = By.xpath("//button[text()='ADD TO CART']");
	public By incrementBtn = By.xpath("//*[@class='increment']");
	public By cart = By.xpath("//img[@alt='Cart']");
	public By btnProceesToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	public By btnApply = By.xpath("//*[text()='Apply']");
	public By btnPlaceOrder = By.xpath("//*[text()='Place Order']");
	
	
	public void checkoutProduct()
	{
		driver.findElement(btnAddToCart).click();
		driver.findElement(btnProceesToCheckout).click();
		
	}
	
	
	public boolean verifyPromoButton()
	{
		return driver.findElement(btnApply).isDisplayed();
		
	}
	
	public boolean verifyPlaceOrder()
	{
		return driver.findElement(btnPlaceOrder).isDisplayed();
	}
}
