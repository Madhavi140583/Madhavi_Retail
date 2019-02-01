package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_088_POM {
	private WebDriver driver; 
	
	public RTTC_088_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement UserName; 
	
	@FindBy(id="input-password")
	private WebElement Password;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement LoginBtn; 
	
	@FindBy(xpath="//*[@id='button-menu']/i")
	private WebElement ButtonMenu;
	
	@FindBy(linkText="Customers")
	private WebElement Customers;
		
	@FindBy(linkText="Customer Groups")
	private WebElement CustomerGroups;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddNewIcon;
	
	@FindBy(xpath="//*[@id='form-customer-group']/div[1]/div/div/input")
	private WebElement CustomerGroupNameTextBox;
	
	@FindBy(id="input-description1")
	private WebElement DescriptionTextBox;
	
	@FindBy(xpath="//*[@id='form-customer-group']/div[3]/div/label[1]")
	private WebElement NewCustomerRadioBtn;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveIcon;
	
	@FindBy(linkText="Dashboard")
	private WebElement Dashboard;
	
	@FindBy(linkText="Customers")
	private WebElement Customers1;
	
	@FindBy(xpath="//*[@id='menu-customer']/ul/li[1]/a")
	private WebElement Customers2;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddNewIcon1;
	
	@FindBy(id="input-customer-group")
	private WebElement CustomerGroupdropdown;
	
	@FindBy(id="input-firstname")
	private WebElement FirstNameBox;
	
	@FindBy(id="input-lastname")
	private WebElement LastNameBox;
	
	@FindBy(id="input-email")
	private WebElement EmailBox;
	
	@FindBy(id="input-telephone")
	private WebElement TelephoneBox;
	
	@FindBy(id="input-password")
	private WebElement PasswordBox;
	
	@FindBy(id="input-confirm")
	private WebElement ConfirmBox;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveIcon1;
		
	public void sendUserName(String UserName) {
		this.UserName.clear();
		this.UserName.sendKeys(UserName);
	}
	
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	}
	
	public void clickLoginBtn() {
		this.LoginBtn.click(); 
	}
	
	public void clickButtonMenu() {
		this.ButtonMenu.click(); 
	}
	
	public void clickCustomers() {
		this.Customers.click();
	}
		
	public void clickCustomerGroups() {
		this.CustomerGroups.click();
	}
	
	public void clickAddNewIcon() {
		this.AddNewIcon.click();
	}
		
	public void sendCustomerGroupNameTextBox(String CustomerGroupNameTextBox) {
		this.CustomerGroupNameTextBox.clear();
		this.CustomerGroupNameTextBox.sendKeys(CustomerGroupNameTextBox);
	}
	
	public void sendDescriptionTextBox(String DescriptionTextBox) {
		this.DescriptionTextBox.clear();
		this.DescriptionTextBox.sendKeys(DescriptionTextBox);
	}
		
	public void clickNewCustomerRadioBtn() {
		this.NewCustomerRadioBtn.click();
	}
	
	public void clickSaveIcon() {
		this.SaveIcon.click();	
	}
	
	public void clickDashboard() {
		this.Dashboard.click();
	}
	
	public void clickCustomers1() {
		this.Customers1.click();
	}
	
	public void clickCustomers2() {
		this.Customers2.click();
	}
	
	public void clickAddNewIcon1() {
		this.AddNewIcon1.click();
	}
	
	/*	public void clickCustomerGroupdropdown() {
	this.CustomerGroupdropdown.click();
	Select customerGroup = new Select(CustomerGroupdropdown);
	customerGroup.selectByVisibleText("privileged customer");
	} */
		
	public void clickCustomerGroupdropdown(String customerGroup) {
	this.CustomerGroupdropdown.click();
	Select customerGroupDD = new Select(CustomerGroupdropdown);
	customerGroupDD.selectByVisibleText(customerGroup);
	}
			
	public void sendFirstName(String FirstNameBox) {
		this.FirstNameBox.clear();
		this.FirstNameBox.sendKeys(FirstNameBox);
	}
	
	public void sendLastNameBox(String LastNameBox) {
		this.LastNameBox.clear();
		this.LastNameBox.sendKeys(LastNameBox);
	}
	
	public void sendEmailBox(String EmailBox) {
		this.EmailBox.clear();
		this.EmailBox.sendKeys(EmailBox);
	}
	
	public void sendTelephoneBox(String TelephoneBox) {
		this.TelephoneBox.clear();
		this.TelephoneBox.sendKeys(TelephoneBox);
	}
	
	public void sendPasswordBox(String PasswordBox) {
		this.PasswordBox.clear();
		this.PasswordBox.sendKeys(PasswordBox);
	}
	
	public void sendConfirmBox(String ConfirmBox) {
		this.ConfirmBox.clear();
		this.ConfirmBox.sendKeys(ConfirmBox);
	}
	
	public void clickSaveIcon1() {
		this.SaveIcon1.click();
	}
	
	public void validateMessageText() {
	//	boolean MessageText = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]")).isDisplayed();
		boolean MessageText = driver.findElement(By.xpath("//*[@id='language1']/div[2]/div/div/div[3]/div[2]")).isDisplayed();
		if(MessageText == true)
		{
			System.out.println("Your message has been successfully sent!");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
	} 
	
	
}
