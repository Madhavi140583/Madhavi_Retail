package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_060_POM {
	private WebDriver driver; 
	
	public RTTC_060_POM(WebDriver driver) {
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
	
	@FindBy(linkText="Marketing")
	private WebElement Marketing;
		
	@FindBy(linkText="Mail")
	private WebElement Mail;
	
	@FindBy(id="input-to")
	private WebElement ToListbox;
	
	@FindBy(id="input-subject-1")
	private WebElement SubjectBox;

	@FindBy(xpath="//*[@id='language1']/div[2]/div/div/div[3]/div[2]")
	private WebElement MessageTextbox;
	
	@FindBy(id="button-send")
	private WebElement MailIcon;
			
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]")
	private WebElement MessageText;
	
	@FindBy(id="input-to")
	private WebElement ToListbox1;
	
	@FindBy(id="input-subject-1")
	private WebElement SubjectBox1;
	
	@FindBy(xpath="//*[@id='language1']/div[2]/div/div/div[3]/div[2]")
	private WebElement MessageTextbox1;
	
	@FindBy(id="button-send")
	private WebElement MailIcon1;
			
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]")
	private WebElement MessageText1;
	
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
	
	public void clickMarketing() {
		this.Marketing.click();
	}
		
	public void clickMail() {
		this.Mail.click();
	}
	
	public void clickToListbox() {
		this.ToListbox.click();
		Select toListbox = new Select(ToListbox);
		toListbox.selectByVisibleText("All Customers");
	}
	
	public void sendSubjectBox(String SubjectBox) {
		this.SubjectBox.clear();
		this.SubjectBox.sendKeys(SubjectBox);
	}
	
	public void sendMessageTextbox(String MessageTextbox) {
		this.MessageTextbox.clear();
		this.MessageTextbox.sendKeys(MessageTextbox);
	}
				
	public void clickMailIcon() {
		this.MailIcon.click();	
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
	
	public void clickToListbox1() {
		this.ToListbox1.click();
		Select toListbox1 = new Select(ToListbox1);
		toListbox1.selectByVisibleText("Products");
	}
	
	public void sendSubjectBox1(String SubjectBox1) {
		this.SubjectBox1.clear();
		this.SubjectBox1.sendKeys(SubjectBox1);
	}
	
	public void sendMessageTextbox1(String MessageTextbox1) {
		this.MessageTextbox1.clear();
		this.MessageTextbox1.sendKeys(MessageTextbox1);
	}
				
	public void clickMailIcon1() {
		this.MailIcon1.click();	
	}
	
	public void validateMessageText1() {
	//	boolean MessageText1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]")).isDisplayed();
		boolean MessageText1 = driver.findElement(By.xpath("//*[@id='language1']/div[2]/div/div/div[3]/div[2]")).isDisplayed();
		if(MessageText1 == true)
		{
			System.out.println("Your message has been successfully sent!");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
			
	}

}
