package pageObjects;

import org.openqa.selenium.By;

public class AdminPage {

	public By btnSearch = By.xpath("//*[@type='submit']");
	public By employeeSearchtableRow = By.xpath("//div[contains(@class,'oxd-table-row')]");

	public By btnAdd = By.xpath("(//button[contains(text(),add)])[5]");

	// Add user
	public By ddUserRole = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
	public By ddStatus = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
	
	
	public By txtEmpName = By.xpath("//input[@placeholder='Type for hints...']");
	public By txtUserName = By.xpath("(//input[contains(@class,'oxd-input')])[2]");
	public By txtPassword1 = By.xpath("(//*[@type='password'])[1]");
	public By txtPassword2 = By.xpath("(//*[@type='password'])[2]");
	public By btnSave = By.xpath("//button[@type='submit']");
	
	
}
