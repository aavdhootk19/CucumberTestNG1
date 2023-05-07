package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;

	public WebDriver openBrowser() throws IOException {
		
		

		FileInputStream fis = new FileInputStream(
				new File(System.getProperty("user.dir") + "//src//test//resources//global.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		String browserProperties = prop.getProperty("browser");

		// To get browser name from command line arguments
		String browserCommandLine = System.getProperty("browser");

		// If we pass browser name from command line then it take browser name from
		// command line
		String browser = browserCommandLine != null ? browserCommandLine : browserProperties;

		System.out.println("Opening browser started ");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}

		return driver;

	}

}
