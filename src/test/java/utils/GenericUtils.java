package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;

import base.BasePage;
import pageObjects.OffersPage;

public class GenericUtils extends BasePage {

	
	public static void switchToOfferPage() {
		
		OffersPage offerPage  = new OffersPage();
		driver.findElement(offerPage.lnkTopDeals).click();
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();

		while (it.hasNext()) {
			String window = (String) it.next();

			if (!window.equalsIgnoreCase(currentWindow)) {
				driver.switchTo().window(window);
			}

		}
	}
	
	
	public static String getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") +"//src//test//resources//global.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public void gotoPage(String page)
	{
		driver.findElement(By.xpath("//span[text()='"+page+"']/..")).click();
	}
}
