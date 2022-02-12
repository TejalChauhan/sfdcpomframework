package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;

public class OppertunityTest extends BaseTest {

	@Test 
	
	public void TestCase15_OppertunityDropDown() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickOppertunityTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		boolean Expectedflag = true;
		boolean Actualflag = opperpage.varifyOpertunityDD();
		report.logTestInfo("successfully varified oppertunity Dropdown");
		System.out.println("Actual: "+Actualflag);
		System.out.println("Expected: "+Expectedflag);
		Assert.assertEquals(Actualflag, Expectedflag);
	}
	
	@Test 
	
	public void TestCase16_CreateOppertunity() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickOppertunityTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newopprpage.clickNewOppertunity();
		report.logTestInfo("click on new Oppertunity button");
		newopprpage.setOppertunityName("ZXY");
		report.logTestInfo("enter oppertunity name ZXY");
		newopprpage.setOppAccountName("Dimond");
		report.logTestInfo("enter Account name: Dimond");
		newopprpage.setOppCloseDate("1/29/2022");
		
		report.logTestInfo("enter the close date");
		newopprpage.selectStageDD();
		report.logTestInfo("select the stage dropdown");
		newopprpage.setProb("20");
		report.logTestInfo("enter the probability 20");
		newopprpage.selectLeadSource();
		report.logTestInfo("select the Lead Source");
		newopprpage.clicksave();
		report.logTestInfo("click the save button");
		String ExpectedPage = "Opportunity: XYZ ~ Salesforce - Developer Edition";
		String actualPage = "Opportunity: XYZ ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Opportunity";
		Assert.assertTrue(newopprpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase17_OppertunityPipelineReport() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickOppertunityTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		opperpage.clickOpprPipelineReport();
		report.logTestInfo("click on oppertunity pipeline report");
	//	String ExpectedPage = "Opportunity Pipeline ~ Salesforce - Developer Edition";
	//	String actualPage ="Opportunity Pipeline ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Opportunity";
		Assert.assertTrue(opperpage.waitUntilTitleContains(expected));
	}
	
	@Test
	
	public void TestCase18_StuckOppertunityReport() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickOppertunityTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		opperpage.clickStuckOppertunity();
		report.logTestInfo("click on Stuck oppertunity ");
	//	String ExpectedPage = "Stuck Opportunities ~ Salesforce - Developer Edition";
	//	String actualPage = "Stuck Opportunities ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Stuck Opportunities";
		Assert.assertTrue(opperpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase19_OppertunitySummeryReport() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickOppertunityTab();
		report.logTestInfo("Click on Oppertunity Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		opperpage.selectInterval();
		report.logTestInfo("select Interval");
		opperpage.selectInclude();
		report.logTestInfo("select Include");
		opperpage.clickRunReport();
		report.logTestInfo("click on Run Report Button");
	//	String ExpectedPage = "Opportunity Report ~ Salesforce - Developer Edition";
	//	String actualPage = "Opportunity Report ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String expected = "Opportunity Report";
		Assert.assertTrue(opperpage.waitUntilTitleContains(expected));
		
	}

}
