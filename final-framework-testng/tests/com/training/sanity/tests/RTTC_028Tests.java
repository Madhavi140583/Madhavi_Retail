package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_028_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_028Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_028_POM RTTC028POM;
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
		RTTC028POM = new RTTC_028_POM(driver);
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
	public void validRetailLoginTest3() throws InterruptedException {
		screenShot.captureScreenShot("TC28_1_LoginScreen");
		RTTC028POM.sendUserName("admin");
		RTTC028POM.sendPassword("admin@123");
		RTTC028POM.clickLoginBtn(); 
		System.out.println("Login page displayed Successfully");
		screenShot.captureScreenShot("TC28_2_DashboardScreen");
		RTTC028POM.clickButtonMenu();
		System.out.println("Dashboard page displayed Successfully");
		RTTC028POM.clickReports();
		screenShot.captureScreenShot("TC28_3_ReportsScreen");
		RTTC028POM.clickCustomers();
		screenShot.captureScreenShot("TC28_4_CustomersScreen");
		RTTC028POM.clickCustomerActivity();
		screenShot.captureScreenShot("TC28_5_CustomerActivityScreen");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RTTC028POM.sendCustomersField("madhavi m");
		screenShot.captureScreenShot("TC28_6_CustomersDetailsScreen");
		System.out.println("Customer Activity page displayed Successfully");
		RTTC028POM.clickFilterBtn();
		screenShot.captureScreenShot("TC28_7_StatusFilteredScreen");
	}
	
}
