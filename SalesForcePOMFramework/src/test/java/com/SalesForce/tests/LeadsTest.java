package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;

public class LeadsTest extends BaseTest {
	
	@Test 
	
	public void TestCase20_LeadTab() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickLeadTab();
		report.logTestInfo("Click on Lead Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		leadpage.clickLeadDD();
		report.logTestInfo("Displaying the Leads: Home page");
	//	String ExpectedPage = "Leads: Home ~ Salesforce - Developer Edition";
	//	String actualPage = "Leads: Home ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Leads";
		Assert.assertTrue(leadpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase21_LeadsSelectView() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickLeadTab();
		report.logTestInfo("Click on Lead Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		leadpage.clickLeadDD();
		report.logTestInfo("click on Lead DropDown ");
		boolean Expectedflag = true;
		boolean Actualflag = leadpage.verifyLeadDropDownlist();
		report.logTestInfo("verify the lead dropdown list");
		System.out.println("Actual: "+Actualflag);
		System.out.println("Expected: "+Expectedflag);
		Assert.assertEquals(Actualflag, Expectedflag);
		
	}
	
	@Test
	
	public void TestCase22_LeadsDefaultView() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickLeadTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		leadpage.selectTodaysLead();
		report.logTestInfo("Select Today's Lead from DropDown");
		homepage.logoutHomepage();
		report.logTestInfo("logout from App");
		loginpage.login_App();
		report.logTestInfo("login successfully in App");
		homepage.clickLeadTab();
		report.logTestInfo("click Lead tab");
		leadpage.clickGoButton();
		report.logTestInfo("click Go Button ");
	//	String ExpectedPage = "Leads ~ Salesforce - Developer Edition";
	//	String actualPage = "Leads ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Leads";
		Assert.assertTrue(leadpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase23_TodaysLead() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickLeadTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		leadpage.selectTodaysLead();
		report.logTestInfo("Select Today's Lead from DropDown");
	//	String ExpectedPage = "Leads ~ Salesforce - Developer Edition";
	//	String actualPage = "Leads ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Leads";
		Assert.assertTrue(leadpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase24_NewLead() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickLeadTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		leadpage.clickNewButton();
		report.logTestInfo("click on New Button");
		leadpage.setLastname("BCDA");
		report.logTestInfo("Enter the last name BCDA");
		leadpage.setCompanyName("BCDA");
		report.logTestInfo("Enter the company name BCDA");
		leadpage.clickSaveButton();
		report.logTestInfo("click save button");
	//	String ExpectedPage = "Lead: ABCD ~ Salesforce - Developer Edition";
	//	String actualPage = "Lead: ABCD ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Lead";
		Assert.assertTrue(leadpage.waitUntilTitleContains(expected));
		
	}

}
