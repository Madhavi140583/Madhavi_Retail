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
import com.training.pom.RTTC_026_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_026Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_026_POM RTTC026POM;
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
		RTTC026POM = new RTTC_026_POM(driver);
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
	public void validRetailLoginTest1() {
		screenShot.captureScreenShot("TC26_1_LoginScreen");
		RTTC026POM.sendUserName("admin");
		RTTC026POM.sendPassword("admin@123");
		RTTC026POM.clickLoginBtn(); 
		System.out.println("Login Successful");
		screenShot.captureScreenShot("TC26_2_DashboardScreen");
		RTTC026POM.clickButtonMenu();
		RTTC026POM.clickReports();
		screenShot.captureScreenShot("TC26_3_ReportsScreen");
		System.out.println("Reports page displayed Successfully");
		RTTC026POM.clickProducts();
		screenShot.captureScreenShot("TC26_4_ProductsScreen");
		System.out.println("Products page displayed Successfully");
		RTTC026POM.clickPurchased();
		screenShot.captureScreenShot("TC26_5_PurchasedScreen");
		System.out.println("Purchased page displayed Successfully");
		RTTC026POM.clickOrderStatus();
		screenShot.captureScreenShot("TC26_6_OrderStatusScreen");
		RTTC026POM.clickFilterBtn();
		screenShot.captureScreenShot("TC26_7_StatusFilteredScreen");
		System.out.println("Order details displayed Successfully");
	}
	
}
