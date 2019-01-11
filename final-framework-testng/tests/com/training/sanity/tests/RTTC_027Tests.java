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
import com.training.pom.RTTC_027_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_027Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_027_POM RTTC027POM;
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
		RTTC027POM = new RTTC_027_POM(driver);
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
	public void validRetailLoginTest2() throws InterruptedException {
		screenShot.captureScreenShot("TC27_1_LoginScreen");
		RTTC027POM.sendUserName("admin");
		RTTC027POM.sendPassword("admin@123");
		RTTC027POM.clickLoginBtn(); 
		System.out.println("Login page displayed Successfully");
		screenShot.captureScreenShot("TC27_2_DashboardScreen");
		RTTC027POM.clickButtonMenu();
		RTTC027POM.clickReports();
		screenShot.captureScreenShot("TC27_3_ReportsScreen");
		System.out.println("Reports page displayed Successfully");
		RTTC027POM.clickCustomers();
		screenShot.captureScreenShot("TC27_4_CustomersScreen");
		RTTC027POM.clickCustomersOnline();
		screenShot.captureScreenShot("TC27_5_CustomersOnlineScreen");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RTTC027POM.sendCustomersField("madhavi m");
		screenShot.captureScreenShot("TC27_6_CustomersDetailsScreen");
		System.out.println("Customer Details page displayed Successfully");
		RTTC027POM.clickFilterBtn();
		screenShot.captureScreenShot("TC27_7_StatusFilteredScreen");
	}
	
}
