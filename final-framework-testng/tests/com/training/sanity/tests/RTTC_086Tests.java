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
import com.training.pom.RTTC_086_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_086Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_086_POM RTTC086POM;
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
		RTTC086POM = new RTTC_086_POM(driver);
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
	public void validRetailLoginTest86() throws InterruptedException {
		screenShot.captureScreenShot("TC86_1_LoginScreen");
		RTTC086POM.sendUserName("admin");
		RTTC086POM.sendPassword("admin@123");
		RTTC086POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC86_2_DashboardScreen");
		RTTC086POM.clickButtonMenu();
		
		RTTC086POM.clickCustomers();
		screenShot.captureScreenShot("TC86_3_CustomersScreen");
		System.out.println("Customers page displayed successfully");
				
		RTTC086POM.clickCustomerGroups();
		screenShot.captureScreenShot("TC86_4_CustomerGroupsScreen");
		System.out.println("CustomerGroups page displayed successfully");
		
		RTTC086POM.clickAddNewIcon();
		screenShot.captureScreenShot("TC86_5_AddNewScreen");
		System.out.println("AddNewIcon clicked successfully");
	
		RTTC086POM.sendCustomerGroupNameTextBox("privileged customer");
		screenShot.captureScreenShot("TC86_6_CustomerGroupNameScreen");
		System.out.println("CustomerGroupName entered successfully");
		
		RTTC086POM.sendDescriptionTextBox("privileged customer");
		screenShot.captureScreenShot("TC86_7_MessageTextBoxScreen");
		System.out.println("DescriptionTextBox entered successfully");
	
		RTTC086POM.clickNewCustomerRadioBtn();
		screenShot.captureScreenShot("TC86_8_NewCustomerRadioBtnScreen");
		System.out.println("NewCustomerRadioBtn selected successfully");
			
		RTTC086POM.clickSaveIcon();
		screenShot.captureScreenShot("TC86_9_SaveScreen");
		System.out.println("SaveIcon clicked successfully");
	
		RTTC086POM.clickDashboard();
		screenShot.captureScreenShot("TC86_10_DashboardScreen");
		System.out.println("Dashboard page displayed successfully");
		
		RTTC086POM.clickCustomers1();
		screenShot.captureScreenShot("TC86_11_Customers1Screen");
		System.out.println("Customers1 page displayed successfully");
		
		RTTC086POM.clickCustomers2();
		screenShot.captureScreenShot("TC86_12_Customers1Screen");
		System.out.println("Customers2 page displayed successfully");
		
		RTTC086POM.clickAddNewIcon1();
		screenShot.captureScreenShot("TC86_13_AddNew1Screen");
		System.out.println("AddNewIcon clicked successfully");
		
		RTTC086POM.clickCustomerGroupdropdown();
		screenShot.captureScreenShot("TC86_14_CustomerGroupNamedropdownScreen");
		System.out.println("CustomerGroupName selected successfully");
		
		RTTC086POM.sendFirstName("Madhavi");
		screenShot.captureScreenShot("TC86_15_FirstNameScreen");
		System.out.println("FirstName entered successfully");
		
		RTTC086POM.sendLastNameBox("M");
		screenShot.captureScreenShot("TC86_16_LastNameScreen");
		System.out.println("LastName entered successfully");
		
		RTTC086POM.sendEmailBox("mmadhavi1@in.ibm.com");
		screenShot.captureScreenShot("TC86_17_EmailScreen");
		System.out.println("Email entered successfully");
		
		RTTC086POM.sendTelephoneBox("9876543210");
		screenShot.captureScreenShot("TC86_18_TelephoneScreen");
		System.out.println("Telephone entered successfully");
		
		RTTC086POM.sendPasswordBox("madhavi1");
		screenShot.captureScreenShot("TC86_19_PasswordScreen");
		System.out.println("Password entered successfully");
		
		RTTC086POM.sendConfirmBox("madhavi1");
		screenShot.captureScreenShot("TC86_20_ConfirmScreen");
		System.out.println("Confirmpassword entered successfully");
		
		RTTC086POM.clickSaveIcon1();
		screenShot.captureScreenShot("TC86_21_Customers Data Saved Screen");
		System.out.println("Data saved successfully");
		
	}
}
