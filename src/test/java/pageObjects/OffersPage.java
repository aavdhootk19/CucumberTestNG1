package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class OffersPage extends BasePage {

	public By lnkTopDeals = By.xpath("//a[contains(text(),'Top Deals')]");
	public By txtSearchField = By.id("search-field");
	public By lblSearchResult = By.xpath("(//tbody/tr/td)[1]");
//	By lnkTopDeals = By.xpath("//a[contains(text(),'Top Deals')]");

}
