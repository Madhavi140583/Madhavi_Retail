package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_057_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_057Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_057_POM RTTC057POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
//		loginPOM = new LoginPOM(driver); 
		RTTC057POM = new RTTC_057_POM(driver);
		baseUrladmin = properties.getProperty("baseURLadmin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrladmin);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRetailLoginTest57() {
		screenShot.captureScreenShot("TC57_1_LoginScreen");
		RTTC057POM.sendUserName("admin");
		RTTC057POM.sendPassword("admin@123");
		RTTC057POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC57_2_DashboardScreen");
		RTTC057POM.clickButtonMenu();
		
		RTTC057POM.clickCatalog();
		screenShot.captureScreenShot("TC57_3_CatalogScreen");
		System.out.println("Catalog page displayed successfully");
				
		RTTC057POM.clickProducts();
		screenShot.captureScreenShot("TC57_4_ProductsScreen");
		System.out.println("Products page displayed successfully");
		
		RTTC057POM.clickAddnewIcon();
		screenShot.captureScreenShot("TC57_5_AddNewScreen");
		System.out.println("AddNew Icon clicked successfully");
	
		RTTC057POM.sendProductName("Finger Ring");
		screenShot.captureScreenShot("TC57_6_ProductName in GeneralTabScreen");
		System.out.println("ProductName entered successfully");
		
		RTTC057POM.sendMetatagTitle("Finger Ring for ladies");
		screenShot.captureScreenShot("TC57_7_MetaTagTitle in GeneralTabScreen");
		System.out.println("MetaTagTitle entered successfully");
	
		RTTC057POM.clickDataTab();
		screenShot.captureScreenShot("TC57_8_DataScreen");
		System.out.println("Data page displayed successfully");
	
		RTTC057POM.sendModel("SKU-012");
		screenShot.captureScreenShot("TC57_9_Model in DataTabScreen");
		System.out.println("Model entered successfully");
	
		RTTC057POM.sendPrice("650");
		screenShot.captureScreenShot("TC57_10_PriceEnteredScreen");
		System.out.println("Price entered Successfully");
			
		RTTC057POM.sendQuantity("50");
		screenShot.captureScreenShot("TC57_11_QuantityEnteredScreen");
		System.out.println("Quantity entered Successfully");
	
		RTTC057POM.sendSEOUrl("home5");
		screenShot.captureScreenShot("TC57_12_SEOUrlEnteredScreen");
		System.out.println("SEOUrl entered Successfully");
		
		RTTC057POM.clickLinksTab();
		screenShot.captureScreenShot("TC57_13_LinksTabScreen");
		System.out.println("Links page displayed Successfully");
	
		RTTC057POM.sendCategories("EARRINGS");
		screenShot.captureScreenShot("TC57_14_CategoriesEnteredScreen");
		System.out.println("Categories entered Successfully");
		
		RTTC057POM.clickDiscountTab();
		screenShot.captureScreenShot("TC57_15_DiscountScreen");
		System.out.println("Discount page displayed Successfully");
	
		RTTC057POM.clickAddIcon();
		screenShot.captureScreenShot("TC57_16_AddIconScreen");
		System.out.println("Add Icon is clicked Successfully");
	
		RTTC057POM.sendQuantityBox("1");
		screenShot.captureScreenShot("TC57_17_QuantityBoxEnteredScreen");
		System.out.println("QuantityBox entered Successfully");
		
		RTTC057POM.sendPriceBox("50");
		screenShot.captureScreenShot("TC57_18_PriceBoxEnteredScreen");
		System.out.println("PriceBox entered Successfully");
		
		RTTC057POM.sendStartDate("2019-01-21");
		screenShot.captureScreenShot("TC57_19_StartDateEnteredScreen");
		System.out.println("StartDate entered Successfully");
		
		RTTC057POM.sendEndDate("2019-01-22");
		screenShot.captureScreenShot("TC57_20_EndDateEnteredScreen");
		System.out.println("EndDate entered Successfully");
			
		RTTC057POM.clickAttributeTab();
		screenShot.captureScreenShot("TC57_21_AttributeScreen");
		System.out.println("Attribute page displayed Successfully");
	
		RTTC057POM.clickOptionTab();
		screenShot.captureScreenShot("TC57_22_OptionScreen");
		System.out.println("Option page displayed Successfully");
	
		RTTC057POM.clickRecurringTab();
		screenShot.captureScreenShot("TC57_23_RecurringScreen");
		System.out.println("Recurring page displayed Successfully");
	
		RTTC057POM.clickSpecialTab();
		screenShot.captureScreenShot("TC57_24_SpecialScreen");
		System.out.println("Special page displayed Successfully");
	
		RTTC057POM.clickImageTab();
		screenShot.captureScreenShot("TC57_25_ImageScreen");
		System.out.println("Image page displayed Successfully");
	
		RTTC057POM.clickRewardPointsTab();
		screenShot.captureScreenShot("TC57_26_RewardPointsScreen");
		System.out.println("RewardPoints page displayed Successfully");
	
		RTTC057POM.clickDesignTab();
		screenShot.captureScreenShot("TC57_27_DesignScreen");
		System.out.println("Design page displayed Successfully");
	
		RTTC057POM.clickSaveIcon();
		screenShot.captureScreenShot("TC57_28_SavedScreen");
		System.out.println("Saved Data page displayed Successfully");
		
	}
}
