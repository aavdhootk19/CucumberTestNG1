package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;
import utils.GenericUtils;

public class Login extends BasePage {
	
	
	public By txtUsername = By.xpath("//*[@name='username']");
	public By txtPassword =  By.xpath("//*[@name='password']");
	public  By btnLogin = By.xpath("//*[@type='submit']");
	
	public void loginOrangeHRM() throws IOException
	{
		driver.get(GenericUtils.getDataFromProperty("orangehrm"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername));
		driver.findElement(txtUsername).sendKeys(GenericUtils.getDataFromProperty("Username"));
		driver.findElement(txtPassword).sendKeys(GenericUtils.getDataFromProperty("Password"));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		driver.findElement(btnLogin).click();
		
	}
	
	

}
