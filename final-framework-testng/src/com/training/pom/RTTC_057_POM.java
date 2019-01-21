package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_057_POM {
	private WebDriver driver; 
	
	public RTTC_057_POM(WebDriver driver) {
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
		
	@FindBy(linkText="Products")
	private WebElement Products;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a/i")
	private WebElement AddNewicon;
	
	@FindBy(id="input-name1")
	private WebElement ProductName;

	@FindBy(id="input-meta-title1")
	private WebElement MegatagTitle;
	
	@FindBy(linkText="Data")
	private WebElement DataTab;
	
	@FindBy(id="input-model")
	private WebElement Model;
	
	@FindBy(id="input-price")
	private WebElement Price;
	
	@FindBy(id="input-quantity")
	private WebElement Quantity;
	
	@FindBy(id="input-keyword")
	private WebElement SEOUrl;
	
	@FindBy(linkText="Links")
	private WebElement LinksTab;
	
	@FindBy(id="input-category")
	private WebElement Categories;	
	
	@FindBy(linkText="Discount")
	private WebElement DiscountTab;

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
		
	@FindBy(linkText="Attribute")
	private WebElement AttributeTab;
	
	@FindBy(linkText="Option")
	private WebElement OptionTab;
	
	@FindBy(linkText="Recurring")
	private WebElement RecurringTab;
	
	@FindBy(linkText="Special")
	private WebElement SpecialTab;
	
	@FindBy(linkText="Image")
	private WebElement ImageTab;
	
	@FindBy(linkText="Reward Points")
	private WebElement RewardPointsTab;
	
	@FindBy(linkText="Design")
	private WebElement DesignTab;
	
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
		
	public void clickProducts() {
		this.Products.click();
	}
	
	public void clickAddnewIcon() {
		this.AddNewicon.click();
	}
	
	public void sendProductName(String ProductName) {
		this.ProductName.clear();
		this.ProductName.sendKeys(ProductName);
	}
	
	public void sendMetatagTitle(String MegatagTitle) {
		this.MegatagTitle.clear();
		this.MegatagTitle.sendKeys(MegatagTitle);
	}
	
	public void clickDataTab() {
		this.DataTab.click();
	}
	
	public void sendModel(String Model) {
		this.Model.clear();
		this.Model.sendKeys(Model);
	}
	
	public void sendPrice(String Price) {
		this.Price.clear();
		this.Price.sendKeys(Price);
	}
	
	public void sendQuantity(String Quantity) {
		this.Quantity.clear();
		this.Quantity.sendKeys(Quantity);
	}
	
	public void sendSEOUrl(String SEOUrl) {
		this.SEOUrl.clear();
		this.SEOUrl.sendKeys(SEOUrl);
	}
	
	public void clickLinksTab() {
		this.LinksTab.click();
	}
	
	public void sendCategories(String Categories) {
		this.Categories.clear();
		this.Categories.sendKeys(Categories);
	}
	
	public void clickDiscountTab() {
		this.DiscountTab.click();
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
			
	public void clickAttributeTab() {
			this.AttributeTab.click();	
	}

	public void clickOptionTab() {
			this.OptionTab.click();	
	}

	public void clickRecurringTab() {
			this.RecurringTab.click();	
	}

	public void clickSpecialTab() {
			this.SpecialTab.click();	
	}

	public void clickImageTab() {
			this.ImageTab.click();	
	}

	public void clickRewardPointsTab() {
			this.RewardPointsTab.click();
	}

	public void clickDesignTab() {
			this.DesignTab.click();	
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
