package com.SalesForceApp.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SalesFoceApp.pages.LeadsPages.LeadsPage;
import com.SalesForce.utility.Constants;
import com.SalesForce.utility.GenerateExtentReport;
import com.SalesForce.utility.commonUtilities;
import com.SalesForceApp.pages.AccountPages.AccountPage;
import com.SalesForceApp.pages.AccountPages.MergeAccountPage;
import com.SalesForceApp.pages.AccountPages.UnSaveReportAccountPage;
import com.SalesForceApp.pages.AccountPages.ViewAccountPage;
import com.SalesForceApp.pages.ContactsPages.ContactsPage;
import com.SalesForceApp.pages.ContactsPages.NewContactPage;
import com.SalesForceApp.pages.ContactsPages.NewViewContactPage;
import com.SalesForceApp.pages.HomePages.HomePage;
import com.SalesForceApp.pages.LoginPages.ForgotPassword;
import com.SalesForceApp.pages.LoginPages.LoginPage;
import com.SalesForceApp.pages.OppertunityPages.NewOppertunityPage;
import com.SalesForceApp.pages.OppertunityPages.OppertunityPage;
import com.SalesForceApp.pages.RandomScenarioPages.CustomizedMyTabpage;
import com.SalesForceApp.pages.RandomScenarioPages.RandomScenarioPage;
import com.SalesForceApp.pages.UserMenuPages.MyProfileUserMenu;
import com.SalesForceApp.pages.UserMenuPages.MySettingUserMenu;
import com.SalesForceApp.pages.UserMenuPages.UserMenuPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	protected static WebDriver driver;
	protected static GenerateExtentReport report=GenerateExtentReport.getInstance();
	protected static LoginPage loginpage;
	protected static ForgotPassword forgotpw;
	protected static HomePage homepage;
	protected static UserMenuPage usermenupage;
	protected static MyProfileUserMenu myprofilepage;
	protected static MySettingUserMenu mysettingpage;
	protected static AccountPage accountpage;
	protected static UnSaveReportAccountPage reportaccpage;
	protected static MergeAccountPage mergeaccpage;
	protected static ViewAccountPage viewaccpage;
	protected static OppertunityPage opperpage;
	protected static NewOppertunityPage newopprpage;
	protected static LeadsPage leadpage;
	protected static ContactsPage contactspage;
	protected static NewContactPage newContpage;
	protected static NewViewContactPage newViewContpage;
	protected static RandomScenarioPage ranscpage;
	protected static CustomizedMyTabpage custabpage;
	
	
	
	@BeforeTest
	public void setUp() {
		System.out.println("Before Test is executing");
		report.startExtentReport();
		System.out.println("Entent Report document is created");
		
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void initialSetUp(String browserName,Method method)
	{
		
		report.startNewTestReport(method.getName());
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(commonUtilities.getApp_Property("url"));
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
		forgotpw = new ForgotPassword(driver);
		homepage = new HomePage(driver);
		usermenupage = new UserMenuPage(driver);
		myprofilepage = new MyProfileUserMenu(driver);
		mysettingpage = new MySettingUserMenu(driver);
		accountpage = new AccountPage(driver);
		reportaccpage = new UnSaveReportAccountPage(driver);
		mergeaccpage = new MergeAccountPage(driver);
		viewaccpage = new ViewAccountPage(driver);
		opperpage = new OppertunityPage(driver);
		newopprpage = new NewOppertunityPage(driver);	
		leadpage = new LeadsPage(driver);
		contactspage = new ContactsPage(driver);
		newContpage = new NewContactPage(driver);
		newViewContpage = new NewViewContactPage(driver);
		ranscpage = new RandomScenarioPage(driver);
		custabpage = new CustomizedMyTabpage(driver);
			
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			report.logTestPass();
		}else if (result.getStatus()==ITestResult.FAILURE){
			report.logTestFail();
			String path=takescreenshot();
			try {
				report.logger.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		driver.quit();
	}
	@AfterTest
	public void endUp()
	{
		report.endExtentReport();
	}
	public static String takescreenshot() {
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		String filePath=Constants.SCREENSHOT_PATH+"screenimage.jpg";
		File DestFile=new File(filePath);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filePath;
	}
	

}
