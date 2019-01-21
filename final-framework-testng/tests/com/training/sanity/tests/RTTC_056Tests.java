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
import com.training.pom.RTTC_056_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_056Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_056_POM RTTC056POM;
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
		RTTC056POM = new RTTC_056_POM(driver);
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
	public void validRetailLoginTest56() {
		screenShot.captureScreenShot("TC56_1_LoginScreen");
		RTTC056POM.sendUserName("admin");
		RTTC056POM.sendPassword("admin@123");
		RTTC056POM.clickLoginBtn(); 
		System.out.println("Login Successful");
		
		screenShot.captureScreenShot("TC56_2_DashboardScreen");
		RTTC056POM.clickButtonMenu();
		RTTC056POM.clickCatalog();
		screenShot.captureScreenShot("TC56_3_CatalogScreen");
		System.out.println("Catalog page displayed Successfully");
		
		RTTC056POM.clickCategories();
		screenShot.captureScreenShot("TC56_4_CategoriesScreen");
		System.out.println("Categories page displayed Successfully");
		
		RTTC056POM.clickProducts();
		screenShot.captureScreenShot("TC56_5_ProductsScreen");
		System.out.println("Products page displayed Successfully");
		
		RTTC056POM.clickEditBtn();
		screenShot.captureScreenShot("TC56_6_EditScreen");
		System.out.println("Edit page displayed Successfully");
	
		RTTC056POM.clickDataLink();
		screenShot.captureScreenShot("TC56_7_DataScreen");
		System.out.println("Data page displayed Successfully");
	
		RTTC056POM.sendQuantity("45");
		screenShot.captureScreenShot("TC56_8_QuantityEnteredScreen");
		System.out.println("Quantity entered Successfully");
	
		RTTC056POM.sendSEOUrl("home7");
		screenShot.captureScreenShot("TC56_9_SEOUrlEnteredScreen");
		System.out.println("SEOUrl entered Successfully");
		
		RTTC056POM.clickDiscountLink();
		screenShot.captureScreenShot("TC56_10_DiscountScreen");
		System.out.println("Discount page displayed Successfully");
	
		RTTC056POM.clickAddIcon();
		screenShot.captureScreenShot("TC56_11_AddIconScreen");
		System.out.println("Add Icon is clicked Successfully");
	
		RTTC056POM.sendQuantityBox("1");
		screenShot.captureScreenShot("TC56_12_QuantityBoxEnteredScreen");
		System.out.println("QuantityBox entered Successfully");
		
		RTTC056POM.sendPriceBox("50");
		screenShot.captureScreenShot("TC56_13_PriceBoxEnteredScreen");
		System.out.println("PriceBox entered Successfully");
		
		RTTC056POM.sendStartDate("2019-01-21");
		screenShot.captureScreenShot("TC56_14_StartDateEnteredScreen");
		System.out.println("StartDate entered Successfully");
		
		RTTC056POM.sendEndDate("2019-01-22");
		screenShot.captureScreenShot("TC56_15_EndDateEnteredScreen");
		System.out.println("EndDate entered Successfully");
	
		RTTC056POM.clickLinksLink();
		screenShot.captureScreenShot("TC56_16_LinksScreen");
		System.out.println("Links page displayed Successfully");
	
		RTTC056POM.clickAttributeLink();
		screenShot.captureScreenShot("TC56_17_AttributeScreen");
		System.out.println("Attribute page displayed Successfully");
	
		RTTC056POM.clickOptionLink();
		screenShot.captureScreenShot("TC56_18_OptionScreen");
		System.out.println("Option page displayed Successfully");
	
		RTTC056POM.clickRecurringLink();
		screenShot.captureScreenShot("TC56_19_RecurringScreen");
		System.out.println("Recurring page displayed Successfully");
	
		RTTC056POM.clickSpecialLink();
		screenShot.captureScreenShot("TC56_20_SpecialScreen");
		System.out.println("Special page displayed Successfully");
	
		RTTC056POM.clickImageLink();
		screenShot.captureScreenShot("TC56_21_ImageScreen");
		System.out.println("Image page displayed Successfully");
	
		RTTC056POM.clickRewardPointsLink();
		screenShot.captureScreenShot("TC56_22_RewardPointsScreen");
		System.out.println("RewardPoints page displayed Successfully");
	
		RTTC056POM.clickDesignLink();
		screenShot.captureScreenShot("TC56_23_DesignScreen");
		System.out.println("Design page displayed Successfully");
	
		RTTC056POM.clickSaveIcon();
		screenShot.captureScreenShot("TC56_24_SavedScreen");
		System.out.println("Saved Data page displayed Successfully");
		
		RTTC056POM.validateSuccessMessage();
		screenShot.captureScreenShot("TC56_25_SuccessMessageScreen");
		System.out.println("Success page displayed Successfully");
		
	}
	
}
