package stepDefinations;

import java.io.IOException;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BasePage {

	
	@Before
	public void setUp() throws IOException
	{
		System.out.print("Setup method started");
		openBrowser();	
	}
	
	
	
	
}
