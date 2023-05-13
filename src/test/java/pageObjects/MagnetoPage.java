package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class MagnetoPage extends BasePage {

	public By signIn = By.xpath("(//a[contains(text(),'Sign In')])[1]");
	public By txtLoginEmail  = By.id("email");
	public By txtPassword = By.id("pass");
	public By btnSignIn = By.id("send2");
	public By searchProduct = By.id("search");	
	public By subMenu = By.xpath("//span[text()='Women']/../..//li[contains(@class,'level1')]/a/span[contains(@class,'ui-menu-icon')]/following-sibling::span");
	
	
	public By txtQty = By.id("qty");
	public By firstProduct = By.xpath("(//span[@class='product-image-wrapper'])[2]");
	public By addToCart = By.xpath("//button[@title='Add to Cart']");
	public By btnShowCart = By.xpath("(//*[text()='My Cart'])[1]");
	public By lblAddToCartMesg = By.xpath("//*[contains(text(),'You added')]");
	public By lblWishListMesg = By.xpath("//*[contains(text(),'Push It Messenger Bag has been added to your Wish List.')]");
	public By btnAddToWishList = By.xpath("(//*[@class='action towishlist'])[1]");
	public By productNameLink  = By.xpath("//a[@class='product-item-link']");
	public By myCart = By.xpath("//span[text()='My Cart']/..");
	public By btnProceedToCheckout = By.id("top-cart-btn-checkout");
	
	public By lblSubscriptionMsg = By.xpath("//*[text()='Thank you for your subscription.']");
	public By btnSubscribe = By.xpath("//*[@title='Subscribe']");
	public By txtSubscribeEmail = By.id("newsletter");
	
	public By linkAboutUs = By.xpath("//a[text()='About us']");
	
	
	public By btnShopNewYoga = By.xpath("//span[text()='Shop New Yoga']");
	public By blueColor = By.xpath("//div[@option-label='Blue']");
	public By size28 = By.xpath("//div[@option-label='28']");
	
	public By viewAndEditCart = By.xpath("//span[text()='View and Edit Cart']");
	public By removeProductFromCart = By.xpath("//div[@class='cart-container']//a[@title='Remove item']");
	public By lblProductIsrRemoved = By.xpath("//p[text()='You have no items in your shopping cart.']");
	
	// create an account 
	public By linkCreateAnAccount = By.xpath("//a[text()='Create an Account']");
	public By txtFirstName = By.id("firstname");
	public By txtLastName = By.id("lastname");
	public By txtEmail = By.id("email_address");
	public By txtCreateAccountPassword = By.id("password");
	public By txtConfirmPassword = By.id("password-confirmation");
	public By btnCreateAccount = By.xpath("(//span[text()='Create an Account'])[1]");
	
	// Add review
	public By addReview = By.xpath("//a[text()='Add Your Review']");
	public By rating = By.xpath("//*[@id='Rating_5_label']");
	public By txtNickName = By.id("nickname_field");
	public By txtSummary = By.id("summary_field");
	public By txtReview = By.id("review_field");
	public By btnSubmitReview = By.xpath("//*[text()='Submit Review']/..");
	public By lblSubmitReview = By.xpath("//div[contains(text(),'You submitted your review')]");


	// Advance search
	public By linkAdvanceSearch  = By.xpath("//a[text()='Advanced Search']");
	public By txtSku = By.id("sku");
	public By btnSearch =  By.xpath("(//button[@title='Search'])[2]");
	public By lblSearch = By.xpath("//*[@class='search found']");
	public By productList = By.xpath("//ol[@class='products list items product-items']");
	
	public By btnCompareProduct = By.xpath("//a[@class='action tocompare']");
	public By linkProductName = By.xpath("//*[@class='products list items product-items']//a[@class='product-item-link']");
	public By linkCompareProduct = By.xpath("//a[@title='Compare Products']");
	public By productNameItem = By.xpath("//*[@class='product-item-name']/a");
	
}

