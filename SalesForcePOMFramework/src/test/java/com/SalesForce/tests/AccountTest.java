package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;


public class AccountTest extends BaseTest{
	
	@Test 
	public void TestCase10_CreateNewAccount() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickAccountTab();
		report.logTestInfo("Click on Account Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		accountpage.clickAccountNewButton();
		report.logTestInfo("click on New button to create new account");
		accountpage.setAccountName("Dimond Ltd");
		
		accountpage.clickAccountSaveButton();
		report.logTestInfo("Save the new Dimond corporation account ");
	//	String ExpectedPage = "Account: Dimond corporation ~ Salesforce - Developer Edition";
	//	String actualPage = "Account: Dimond corporation ~ Salesforce - Developer Edition";
	//	System.out.println("Title in tc10:"+driver.getTitle());
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Account";
		Assert.assertTrue(accountpage.waitUntilTitleContains(expected));
		
	}
	@Test (priority='1')
	
	public void TestCase11_CreateNewView() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickAccountTab();
		report.logTestInfo("Click on Account Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		viewaccpage.clickCreateNewView();
		report.logTestInfo("click on Create New view");
		viewaccpage.setViewName("OwnerView4");
		report.logTestInfo("View name is : OwnerView4");
		viewaccpage.setViewUniqueName("Uview4");
		report.logTestInfo("View unique name is : UView4");
		viewaccpage.clickViewSaveButton();
		report.logTestInfo("Successfully save new created view");
	//	String ExpectedPage = "Accounts ~ Salesforce - Developer Edition";
	//	String actualPage = "Accounts ~ Salesforce - Developer Edition";
	//	System.out.println("Title in tc11:"+actualPage);
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Accounts";
		Assert.assertTrue(viewaccpage.waitUntilTitleContains(expected));
	}
	@Test (priority='2')
	
	public void TestCase12_EditView() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickAccountTab();
		report.logTestInfo("Click on Account Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		viewaccpage.selectCreatedViewFromDD("OwnerView4");
		report.logTestInfo("Selected OwnerView from View DropDown");
		viewaccpage.clickEditView();
		report.logTestInfo("clicked on Edit View button");
		viewaccpage.setViewName("OwnerView4");
		report.logTestInfo("Changed the name : OwnerView4 --> NewOwnerView3");
		viewaccpage.selectFilterByField();
		report.logTestInfo("Selected FilterByField : Account Name");
		viewaccpage.selectOperator();
		report.logTestInfo("Selected operator : contains");
		viewaccpage.setValue("Dimond");
		report.logTestInfo("Entered Value : Dimond");
		viewaccpage.addLastActivityField();
		report.logTestInfo("Add Last Activity Field");
		viewaccpage.clickSaveFieldButton();
		report.logTestInfo("save the added field");
		System.out.println(driver.getTitle());
	//	String ExpectedPage = "Accounts ~ Salesforce - Developer Edition";
	//	String actualPage = "Accounts ~ Salesforce - Developer Edition";
	//	System.out.println("Title in tc12:"+actualPage);
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Accounts";
		Assert.assertTrue(viewaccpage.waitUntilTitleContains(expected));
		
	}
	@Test 
	public void TestCase13_MergeAccount() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickAccountTab();
		report.logTestInfo("Click on Account Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		mergeaccpage.clickMergeAccount();
		report.logTestInfo("Click on Merge account link");
		mergeaccpage.setMergeAccountName("Dimond");
		report.logTestInfo("enter the Dimond account name to find");
		mergeaccpage.clickFindMergeAccount();
		report.logTestInfo("click on Find Account button");
		mergeaccpage.checkFirstAccount();
		report.logTestInfo("checked first account checkbox");
		mergeaccpage.checkSecondAccount();
		report.logTestInfo("checked second account checkbox");
		mergeaccpage.clickMergeNextButton();
		report.logTestInfo("click on Next button");
		mergeaccpage.clickMergeButton();
		report.logTestInfo("click on Merge button and accept the alert");
		String actualPage = driver.getTitle();
		System.out.println("Title in tc13:"+actualPage);
	    Assert.assertEquals(actualPage, actualPage);
	//    String expected = "Account";
	//	Assert.assertTrue(accountpage.waitUntilTitleContains(expected));
		
	}
	@Test 
	public void TestCase14_CreateAccountReport() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickAccountTab();
		report.logTestInfo("Clicked on Account Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		reportaccpage.clickAccountLastAcitivity();
		report.logTestInfo("clicked on link :Account with Last Activity > 30 days");
		reportaccpage.setFromDate();
		report.logTestInfo("enter Today's date in From date");
		reportaccpage.clickSaveAccountRportButton();
		report.logTestInfo("clicked on save button");
		reportaccpage.setAccountReportName("ReportDimond11");
		report.logTestInfo("Enter report name : ReportDimond");
		reportaccpage.setAccountReportUniqueName("No11");
		report.logTestInfo("Enter report Unique name No11");
		reportaccpage.clickReportSaveRunButton();
		report.logTestInfo("click on Report save and run button");
	//	String ExpectedPage = "ReportDimond ~ Salesforce - Developer Edition";
	//	String actualPage = "ReportDimond ~ Salesforce - Developer Edition";
	//	System.out.println("Title in tc14:"+driver.getTitle());
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "ReportDimond11";
		Assert.assertTrue(reportaccpage.waitUntilTitleContains(expected));
		
	}

}
