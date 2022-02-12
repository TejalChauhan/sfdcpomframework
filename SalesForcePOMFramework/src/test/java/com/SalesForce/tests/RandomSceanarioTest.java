package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;

public class RandomSceanarioTest extends BaseTest{
	
	@Test  
	
	public void TestCase33_FirstnameLastnameLink() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickHomeTab();
		report.logTestInfo("Click on Home Tab on Home page");
		ranscpage.clickFirstnameLastnameLink();
		report.logTestInfo("Click on User Firstname lastname link");
	//	String ExpectedPage = "User: Anu Abcd ~ Salesforce - Developer Edition";
	//	String actualPage = "User: Anu Abcd ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Anu Abcd";
		Assert.assertTrue(ranscpage.waitUntilTitleContains(expected));
				
	}
	
	@Test 	
	public void TestCase34_VerifyEditLastname() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickHomeTab();
		report.logTestInfo("Click on Home Tab on Home page");
		ranscpage.clickFirstnameLastnameLink();
		report.logTestInfo("Click on User Firstname lastname link");
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
		ranscpage.SwitchToDefaultContent();
		report.logTestInfo("Switch back to default content");
		boolean Actualflag = myprofilepage.verifyLastnameUserAccount();
		boolean Expectedflag = true;
		Assert.assertEquals(Actualflag, Expectedflag);
	}
	
	@Test  
	public void TestCase35_VerifyTabCustomization() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		custabpage.clickPlusAllTab();
		report.logTestInfo("Click on Plus image");
		custabpage.clickCustomisedTab();
		report.logTestInfo("click on customized My Tabs");
		custabpage.selectedTab();
		report.logTestInfo("Select the Order Tab");
		custabpage.clickRemoveButton();
		report.logTestInfo("click on remove Tab button");
		custabpage.clickSaveCustomisedTab();
		report.logTestInfo("click on save button");
		boolean Actualflag = custabpage.verifyRemovedTab();
		report.logTestInfo("verify Tab is removed or not");
		homepage.logoutHomepage();
		report.logTestInfo("logout from salsesforce");
		loginpage.login_App();
		report.logTestInfo("Successfully login the salsesfore");
		boolean Expectedflag = true;
		Assert.assertEquals(Actualflag, Expectedflag);
	}
	
	@Test  
	
	public void TestCase36_BlockEventCalender() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickHomeTab();
		report.logTestInfo("Click on Home Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		ranscpage.clickCurrentDate();
		report.logTestInfo("click on cuurent Date");
		ranscpage.clickEightPMlink();
		report.logTestInfo("click on 8:00 PM link");
		String CurrentWindow = ranscpage.getCurrentWindow();
		report.logTestInfo("Get the current window title");
		ranscpage.clickSubjectCombo();
		report.logTestInfo("click on Subject Combo");
		ranscpage.handleMultiWindow(CurrentWindow);
		report.logTestInfo("handle multiple window :switch to new window");
		ranscpage.clickOther();
		report.logTestInfo("Click on other");
		ranscpage.switchToCurrentWindow(CurrentWindow);
		report.logTestInfo("Switch to old wondow ");
		ranscpage.setEndTime("9:00 PM");
		report.logTestInfo("Enter the Endtime 9:00PM");
		ranscpage.clickSaveEvent();
		report.logTestInfo("click save button");
	//	String ExpectedPage = "Calendar for Anu Abcd ~ Salesforce - Developer Edition";
	//	String actualPage = "Calendar for Anu Abcd ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);	
		String expected = "Anu Abcd";
		Assert.assertTrue(ranscpage.waitUntilTitleContains(expected));
	}
	
	@Test  
	
	public void TestCase37_BlockEventWeek() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickHomeTab();
		report.logTestInfo("Click on Home Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		ranscpage.clickCurrentDate();
		report.logTestInfo("click on current Date");
		ranscpage.clickFourPMlink();
		String CurrentWindow = ranscpage.getCurrentWindow();
		report.logTestInfo("Get the current window title");
		ranscpage.clickSubjectCombo();
		report.logTestInfo("click on Subject Combo");
		ranscpage.handleMultiWindow(CurrentWindow);
		report.logTestInfo("handle multiple window :switch to new window");
		ranscpage.clickOther();
		report.logTestInfo("Click on other");
		ranscpage.switchToCurrentWindow(CurrentWindow);
		report.logTestInfo("Switch to old wondow ");
		ranscpage.setEndTime("7:00 PM");
		report.logTestInfo("Enter the Endtime 7:00PM");
		ranscpage.clickRecurenceRadiobtn();
		report.logTestInfo("click on Recurence radio button");
		ranscpage.clickWeekRadiobutton();
		report.logTestInfo("click on week radio button");
		ranscpage.setEndDateafter2weeks();
		report.logTestInfo("enter the Enddate after two week from today");
		ranscpage.clickSaveEvent();
		report.logTestInfo("click on save button");
		ranscpage.clickMonthView();
		report.logTestInfo("click on month view");
	//	String ExpectedPage = "Calendar for Anu Abcd - Month View ~ Salesforce - Developer Edition";
	//	String actualPage = "Calendar for Anu Abcd - Month View ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);	
		String expected = "Anu Abcd";
		Assert.assertTrue(ranscpage.waitUntilTitleContains(expected));
		
	}

}
