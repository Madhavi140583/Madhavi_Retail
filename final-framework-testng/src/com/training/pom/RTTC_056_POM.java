package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_056_POM {
	private WebDriver driver; 
	
	public RTTC_056_POM(WebDriver driver) {
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
	
	@FindBy(linkText="Catalog")
	private WebElement Catalog;
	
	@FindBy(linkText="Categories")
	private WebElement Categories;
	
	@FindBy(linkText="Products")
	private WebElement Products;
	
	@FindBy(xpath="//*[@id='form-product']/div/table/tbody/tr[1]/td[8]/a/i")
	private WebElement EditBtn;
	
	@FindBy(linkText="Data")
	private WebElement DataLink;

	@FindBy(id="input-quantity")
	private WebElement Quantity;
	
	@FindBy(id="input-keyword")
	private WebElement SEOUrl;
	
	@FindBy(linkText="Discount")
	private WebElement DiscountLink;

	@FindBy(xpath="//*[@id='discount']/tfoot/tr/td[2]/button")
	private WebElement AddIcon;
	
	@FindBy(xpath="//*[@id='discount-row0']/td[2]/input")
	private WebElement QuantityBox;
	
	@FindBy(xpath="//*[@id='discount-row0']/td[4]/input")
	private WebElement PriceBox;
	
	@FindBy(xpath="//*[@id='discount-row0']/td[5]/div/input")
	private WebElement StartDate;
	
	@FindBy(xpath="//*[@id='discount-row0']/td[6]/div/input")
	private WebElement EndDate;
	
	@FindBy(linkText="Links")
	private WebElement LinksLink;
	
	@FindBy(linkText="Attribute")
	private WebElement AttributeLink;
	
	@FindBy(linkText="Option")
	private WebElement OptionLink;
	
	@FindBy(linkText="Recurring")
	private WebElement RecurringLink;
	
	@FindBy(linkText="Special")
	private WebElement SpecialLink;
	
	@FindBy(linkText="Image")
	private WebElement ImageLink;
	
	@FindBy(linkText="Reward Points")
	private WebElement RewardPointsLink;
	
	@FindBy(linkText="Design")
	private WebElement DesignLink;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button/i")
	private WebElement SaveIcon;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]")
	private WebElement successmessage;
	
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
	
	public void clickCatalog() {
		this.Catalog.click();
	}

	public void clickCategories() {
		this.Categories.click();
	}
	
	public void clickProducts() {
		this.Products.click();
	}
	
	public void clickEditBtn() {
		this.EditBtn.click();
	}
	
	public void clickDataLink() {
		this.DataLink.click();
	}
	
	public void sendQuantity(String Quantity) {
		this.Quantity.clear();
		this.Quantity.sendKeys(Quantity);
	}
	
	public void sendSEOUrl(String SEOUrl) {
		this.SEOUrl.clear();
		this.SEOUrl.sendKeys(SEOUrl);
	}
	
	public void clickDiscountLink() {
		this.DiscountLink.click();
	}
	
	public void clickAddIcon() {
		this.AddIcon.click();
	}
	
	public void sendQuantityBox(String QuantityBox) {
		this.QuantityBox.clear();
		this.QuantityBox.sendKeys(QuantityBox);
	}
	
	public void sendPriceBox(String PriceBox) {
		this.PriceBox.clear();
		this.PriceBox.sendKeys(PriceBox);
	}
	
	public void sendStartDate(String StartDate) {
		this.StartDate.clear();
		this.StartDate.sendKeys(StartDate);
	}
	
	public void sendEndDate(String EndDate) {
		this.EndDate.clear();
		this.EndDate.sendKeys(EndDate);
	}
	
	public void clickLinksLink() {
		this.LinksLink.click();
	}
	
	public void clickAttributeLink() {
			this.AttributeLink.click();	
	}

	public void clickOptionLink() {
			this.OptionLink.click();	
	}

	public void clickRecurringLink() {
			this.RecurringLink.click();	
	}

	public void clickSpecialLink() {
			this.SpecialLink.click();	
	}

	public void clickImageLink() {
			this.ImageLink.click();	
	}

	public void clickRewardPointsLink() {
			this.RewardPointsLink.click();
	}

	public void clickDesignLink() {
			this.DesignLink.click();	
	}
	
	public void clickSaveIcon() {
		this.SaveIcon.click();	
	}
	
	public void validateSuccessMessage() {
		boolean successmessage = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).isDisplayed();
		
		if(successmessage == true)
		{
			System.out.println("Success: You have modified products!");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
	}
}
