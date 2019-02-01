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
import com.training.dataproviders.RTTC088DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_088_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_088Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_088_POM RTTC088POM;
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
		RTTC088POM = new RTTC_088_POM(driver);
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
	@Test(dataProvider = "excel-inputs", dataProviderClass = RTTC088DataProviders.class)
	public void validRetailLoginTest88(String customergroupname, String description,String customergroupdd,String firstname,String lastname,String email,String telephone,String password,String confirmpassword ) throws InterruptedException {
		screenShot.captureScreenShot("TC88_1_LoginScreen");
		RTTC088POM.sendUserName("admin");
		RTTC088POM.sendPassword("admin@123");
		RTTC088POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC88_2_DashboardScreen");
		RTTC088POM.clickButtonMenu();
		
		RTTC088POM.clickCustomers();
		screenShot.captureScreenShot("TC88_3_CustomersScreen");
		System.out.println("Customers page displayed successfully");
				
		RTTC088POM.clickCustomerGroups();
		screenShot.captureScreenShot("TC88_4_CustomerGroupsScreen");
		System.out.println("CustomerGroups page displayed successfully");
		
		RTTC088POM.clickAddNewIcon();
		screenShot.captureScreenShot("TC88_5_AddNewScreen"); 
		System.out.println("AddNewIcon clicked successfully");
	
		RTTC088POM.sendCustomerGroupNameTextBox(customergroupname);
		screenShot.captureScreenShot("TC88_6_CustomerGroupName"+customergroupname);
		System.out.println("CustomerGroupName entered successfully");
		
		RTTC088POM.sendDescriptionTextBox(description);
		screenShot.captureScreenShot("TC88_7_Description"+description);
		System.out.println("DescriptionTextBox entered successfully");
	
		RTTC088POM.clickNewCustomerRadioBtn();
		screenShot.captureScreenShot("TC88_8_NewCustomerRadioBtnScreen");
		System.out.println("NewCustomerRadioBtn selected successfully");
			
		RTTC088POM.clickSaveIcon();
		screenShot.captureScreenShot("TC88_9_SaveScreen");
		System.out.println("SaveIcon clicked successfully");
	
		RTTC088POM.clickDashboard();
		screenShot.captureScreenShot("TC88_10_DashboardScreen");
		System.out.println("Dashboard page displayed successfully");
		
		RTTC088POM.clickCustomers1();
		screenShot.captureScreenShot("TC88_11_Customers1Screen");
		System.out.println("Customers1 page displayed successfully");
		
		RTTC088POM.clickCustomers2();
		screenShot.captureScreenShot("TC88_12_Customers1Screen");
		System.out.println("Customers2 page displayed successfully");
		
		RTTC088POM.clickAddNewIcon1();
		screenShot.captureScreenShot("TC88_13_AddNew1Screen");
		System.out.println("AddNewIcon clicked successfully");
				
		RTTC088POM.clickCustomerGroupdropdown(customergroupdd);
		screenShot.captureScreenShot("TC88_14_CustomerGroupNamedropdownScreen"+customergroupdd);
		System.out.println("CustomerGroupName selected successfully"); 

		RTTC088POM.sendFirstName(firstname);
		screenShot.captureScreenShot("TC88_15_Firstname"+firstname);
		System.out.println("FirstName entered successfully");
		
		RTTC088POM.sendLastNameBox(lastname);
		screenShot.captureScreenShot("TC88_16_LastName"+lastname);
		System.out.println("LastName entered successfully");
		
		RTTC088POM.sendEmailBox(email);
		screenShot.captureScreenShot("TC88_17_Email"+email);
		System.out.println("Email entered successfully");
		
		RTTC088POM.sendTelephoneBox(telephone);
		screenShot.captureScreenShot("TC88_18_Telephone"+telephone);
		System.out.println("Telephone entered successfully");
		
		RTTC088POM.sendPasswordBox(password);
		screenShot.captureScreenShot("TC88_19_Password"+password);
		System.out.println("Password entered successfully");
		
		RTTC088POM.sendConfirmBox(confirmpassword);
		screenShot.captureScreenShot("TC88_20_ConfirmPassword"+confirmpassword);
		System.out.println("Confirmpassword entered successfully");
		
		RTTC088POM.clickSaveIcon1();
		screenShot.captureScreenShot("TC88_21_Customers Data Saved Screen");
		System.out.println("Data saved successfully");
		
	}
}
