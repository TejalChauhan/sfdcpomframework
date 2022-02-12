package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;

public class UserMenuTest extends BaseTest {
	
	@Test 
	
	public void TestCase5_UserMenuDropdown() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		usermenupage.clickUserDashboardAccount();
		report.logTestInfo("click on Usermenu drop down");
		boolean Expectedflag = true;
		boolean Actualflag=usermenupage.verifyUserMenuDropDown();
		report.logTestInfo("verify usermenu dropdown");
		System.out.println("Actual: "+Actualflag);
		System.out.println("Expected: "+Expectedflag);
		Assert.assertEquals(Actualflag, Expectedflag);
				
	}
	@Test 
	
    public void TestCase6_MyProfileUserMenu() {
    	loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		usermenupage.clickUserDashboardAccount();
		report.logTestInfo("click on Usermenu drop down");
		myprofilepage.clickMyProfile();
		myprofilepage.clickEditProfile();
		report.logTestInfo("click edit profile link");
		myprofilepage.SwitchToFrameEditProfile();
		report.logTestInfo("Switch to ContactInfo frame");
		myprofilepage.clickAbout();
		report.logTestInfo("click on About");
		myprofilepage.setLastname("Abcd");
		report.logTestInfo("Enter the new lastname");
		myprofilepage.clickSaveAll();
		report.logTestInfo("click on saveAll button");
		myprofilepage.SwitchToDefaultContent();
		report.logTestInfo("Switch back to default content");
		myprofilepage.clickPostlink();
		report.logTestInfo("click on the post link");
		myprofilepage.switchtoframepostText();
		report.logTestInfo("switch to frame");
		myprofilepage.setPostText();
		report.logTestInfo("enter the Hello in post Textarea");
		myprofilepage.SwitchToDefaultContent();
		report.logTestInfo("switch to default content");
		myprofilepage.clickShareButton();
		report.logTestInfo("click to share button");
		myprofilepage.clickfilelink();
		report.logTestInfo("click on file link");
		myprofilepage.clickUploadButton();
		report.logTestInfo("click on upload button");
		myprofilepage.setSelectFile();
		report.logTestInfo("select the file to upload");
		myprofilepage.clickAddPhoto();
		report.logTestInfo("click on Addphoto link");
		myprofilepage.switchtoBrowsePhotoframe();
		report.logTestInfo("switch to frame");
		myprofilepage.setBrowseFile();
		report.logTestInfo("browse the file");
		myprofilepage.clickSaveButton();
		report.logTestInfo("click on save button");
		myprofilepage.clickCropphoto();
		report.logTestInfo("click on cropphoto");
		myprofilepage.SwitchToDefaultContent();		
		report.logTestInfo("switch to default content");		
		boolean Actualflag = myprofilepage.verifyLastnameUserAccount();
		boolean Expectedflag = true;
		Assert.assertEquals(Actualflag, Expectedflag);	
	}
	
	@Test  
	
    public void TestCase7_MySettingUserMenu() {
    	loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		usermenupage.clickUserDashboardAccount();
		report.logTestInfo("click on Usermenu drop down");
		mysettingpage.clickMySetting();
		report.logTestInfo("click on My setting");
		mysettingpage.clickPersonalLink();
		report.logTestInfo("click on Personal link");
		mysettingpage.clickLoginHistory();
		report.logTestInfo("click on Login History");
		mysettingpage.clickDownload();
		report.logTestInfo("click on Download button");
		mysettingpage.clickDisplayLayout();
		report.logTestInfo("Click on Display Layout");
		mysettingpage.clickCustomizedMyTab();
		report.logTestInfo("Click on CustomizedMyTab");
		mysettingpage.selectCustomApp();
		report.logTestInfo("click on select CustomApp");
		mysettingpage.VerifyaddReportTab();
		report.logTestInfo("Verfy and Add Report Tab");
		mysettingpage.clickSaveButton();
		report.logTestInfo("click on save button");
		mysettingpage.clickEmaillink();
		report.logTestInfo("click on email link");
		mysettingpage.clickEmailSettinglink();
		report.logTestInfo("click on email setting link");		
		mysettingpage.setEmailname("Anu");
		report.logTestInfo("enter Email name");
		mysettingpage.setEmailSender("abc@gmail.com");
		report.logTestInfo("Enter email sender name");
		mysettingpage.clickBCCEmail();
		report.logTestInfo("click on BCCEmail");
		mysettingpage.clickSaveEmailDetail();
		report.logTestInfo("click on save Email Dedail button");
		mysettingpage.acceptAlert();	
		report.logTestInfo("accept alert");
		mysettingpage.clickCalenderLink();
		report.logTestInfo("click on calender link");
		mysettingpage.clickCalenderActivity();
		report.logTestInfo("click on calender activity");
		mysettingpage.clickOpenCalender();
		report.logTestInfo("click on open calender");
	//	String ExpectedPage = "Activity Reminders ~ Salesforce - Developer Edition";
	//	String actualPage = "Activity Reminders ~ Salesforce - Developer Edition";
		System.out.println(driver.getTitle());
	//	Assert.assertEquals(actualPage, ExpectedPage);		
		String expected = "Activity";
		Assert.assertTrue(mysettingpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
    public void TestCase8_DeveloperConsole() {
    	loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		usermenupage.clickUserDashboardAccount();
		report.logTestInfo("click on Usermenu drop down");
		String currentWindow = usermenupage.getCurrentWindow();
		report.logTestInfo("Get the current Window title in currentWindow");
		usermenupage.clickDeveloperConsole();
		report.logTestInfo("click on developer console");
		usermenupage.closeNewWindow(currentWindow);
		report.logTestInfo("close the new window");
		usermenupage.switchToCurrentWindow(currentWindow);
		report.logTestInfo("switch to current window");
	//	String ExpectedPage = "Home Page ~ Salesforce - Developer Edition";
	//	String actualPage = "Home Page ~ Salesforce - Developer Edition";		
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Home Page";
		Assert.assertTrue(usermenupage.waitUntilTitleContains(expected));
		
	}
	
	@Test  
	
    public void TestCase9_Logout() {
    	loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		
		report.logTestInfo("click on Usermenu drop down");
		homepage.logoutHomepage();
		report.logTestInfo("click on loqout in usermenu dropdown");
		String ExpectedPage = "Login | Salesforce";
		String actualPage = "Login | Salesforce";	
		report.logTestInfo("successfully logout from salesforce:Displaying Login page");
		Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Login";
		Assert.assertTrue(loginpage.waitUntilTitleContains(expected));
	}

}
