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
import org.testng.annotations.DataProvider;

import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.RTTC090DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_090_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_090Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_090_POM RTTC090POM;
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
		RTTC090POM = new RTTC_090_POM(driver);
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
	@Test(dataProvider = "excel-inputs", dataProviderClass = RTTC090DataProviders.class)
	public void validRetailLoginTest90(String productname, String megatitle,String model,String price,String category,String quantity,String pricebox,String points) throws InterruptedException {
		screenShot.captureScreenShot("TC90_1_LoginScreen");
		RTTC090POM.sendUserName("admin");
		RTTC090POM.sendPassword("admin@123");
		RTTC090POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC90_2_DashboardScreen");
		RTTC090POM.clickButtonMenu();
		
		RTTC090POM.clickCatalog();
		screenShot.captureScreenShot("TC90_3_CatalogScreen");
		System.out.println("Catalog page displayed successfully");
				
		RTTC090POM.clickProducts();
		screenShot.captureScreenShot("TC90_4_ProductsScreen");
		System.out.println("Products page displayed successfully");
		
		RTTC090POM.clickAddNewIcon();
		screenShot.captureScreenShot("TC90_5_AddNewScreen"); 
		System.out.println("AddNewIcon clicked successfully");
	
		RTTC090POM.sendProductName(productname);
		screenShot.captureScreenShot("TC90_6_ProductName"+productname);
		System.out.println("ProductName entered successfully");
		
		RTTC090POM.sendMetatagTitle(megatitle);
		screenShot.captureScreenShot("TC90_7_MegaTitle"+megatitle);
		System.out.println("Mega Tag Title entered successfully");
	
		RTTC090POM.clickDataTab();
		screenShot.captureScreenShot("TC90_8_DataTabScreen");
		System.out.println("DataTab displayed successfully");
		
		RTTC090POM.sendModel(model);
		screenShot.captureScreenShot("TC90_9_Model"+model);
		System.out.println("ModelName entered successfully");
		
		RTTC090POM.sendPrice(price);
		screenShot.captureScreenShot("TC90_10_Price"+price);
		System.out.println("Price entered successfully");
		
		RTTC090POM.sendQuantity(quantity);
		screenShot.captureScreenShot("TC90_11_Quantity"+quantity);
		System.out.println("Quantity entered successfully");
		
		RTTC090POM.sendSEOUrl("home15");
		screenShot.captureScreenShot("TC90_12_SEOUrlEnteredScreen");
		System.out.println("SEOUrl entered Successfully");
		
		RTTC090POM.clickLinksTab();
		screenShot.captureScreenShot("TC90_13_LinksTabScreen");
		System.out.println("LinksTab displayed successfully");
		
		RTTC090POM.sendCategories(category);
		screenShot.captureScreenShot("TC90_14_Category"+category);
		System.out.println("Category entered successfully");
		
		RTTC090POM.clickDiscountTab();
		screenShot.captureScreenShot("TC90_15_DiscountTabScreen");
		System.out.println("DiscountTab displayed successfully");
		
		RTTC090POM.clickAddDiscountIcon();
		screenShot.captureScreenShot("TC90_16_AddDiscountIconScreen");
		System.out.println("AddDiscount fields displayed successfully");
		
		RTTC090POM.sendQuantityBox(quantity);
		screenShot.captureScreenShot("TC90_17_QuantityBox"+quantity);
		System.out.println("Category entered successfully");
		
		RTTC090POM.sendPriceBox(pricebox);
		screenShot.captureScreenShot("TC90_18_PriceBox"+pricebox);
		System.out.println("Pricebox entered successfully");
		
		RTTC090POM.sendStartDate("30-01-2019");
		screenShot.captureScreenShot("TC90_19_StartDate");
		System.out.println("StartDate entered successfully");
		
		RTTC090POM.sendEndDate("31-01-2019");
		screenShot.captureScreenShot("TC90_20_EndDate");
		System.out.println("EndDate entered successfully");
		
		RTTC090POM.clickRewardPointsTab();
		screenShot.captureScreenShot("TC90_21_RewardPointsScreen");
		System.out.println("RewardPoints tab displayed successfully");
	
		RTTC090POM.sendPointsTextbox(points);
		screenShot.captureScreenShot("TC90_21_PointsBox"+points);
		System.out.println("Points entered successfully");
		
		RTTC090POM.clickSaveIcon();
		screenShot.captureScreenShot("TC90_22_SaveScreen");
		System.out.println("SaveIcon clicked successfully");

		
	}
}
