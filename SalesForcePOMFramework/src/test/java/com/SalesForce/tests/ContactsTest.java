package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForceApp.Base.BaseTest;

public class ContactsTest extends BaseTest{
	
	@Test 
	
	public void TestCase25_CreateNewContact() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newContpage.clickNewContactButton();
		report.logTestInfo("click on new contact button");
		newContpage.setLastName("Abcd");
		report.logTestInfo("Enter the last name");
		newContpage.setAccName("Dimond");
		report.logTestInfo("Enter the Account name");
		newContpage.clickSaveButton();
		report.logTestInfo("click on save button");
		//	String ExpectedPage = "Contact: Abcd ~ Salesforce - Developer Edition";
		String actualPage = newContpage.getTitleOfNewContactPage();
		System.out.println("TC25 title of page:"+actualPage);
		String expected = "Contact";
		Assert.assertTrue(newContpage.waitUntilTitleContains(expected));
		
	}
	
	@Test 
	
	public void TestCase26_NewViewContacts() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newViewContpage.clickCreateNewViewContact();
		report.logTestInfo("click on create new view in contact");
		newViewContpage.setViewNameContact("ViewDimondContact5");
		report.logTestInfo("enter the view name");
		newViewContpage.setViewUniqueNameContact("VDC5");
		report.logTestInfo("enter the view unique name");
		newViewContpage.clickViewSaveButton();
		report.logTestInfo("click on the save button");
		//String ExpectedPage = "Contacts ~ Salesforce - Developer Edition";
		//String actualPage = "Contacts ~ Salesforce - Developer Edition";
		//Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = newViewContpage.getTitleOfNewViewContactPage();
		System.out.println("TC26 title of page:"+actualPage);
		String expected = "Contacts";
		Assert.assertTrue(newViewContpage.waitUntilTitleContains(expected));
	}
	
	@Test 
	
	public void TestCase27_RecentCreatedContacts() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		contactspage.selectRecentCreated();
		report.logTestInfo("Select the recent created contact");
		//String ExpectedPage = "Contacts: Home ~ Salesforce - Developer Edition";
		//String actualPage = "Contacts: Home ~ Salesforce - Developer Edition";
		//Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = contactspage.getTitleOfContactPage();
		System.out.println("TC27 title of page:"+actualPage);
		String expected = "Contacts";
		Assert.assertTrue(contactspage.waitUntilTitleContains(expected));
		
	}
	
	@Test 
	
	public void TestCase28_MyContactsView() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		contactspage.selectMyContact();
		report.logTestInfo("Select My contact from dropdown");
	//	String ExpectedPage = "Contacts ~ Salesforce - Developer Edition";
	//	String actualPage = "Contacts ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = contactspage.getTitleOfContactPage();
		System.out.println("TC28 title of page:"+actualPage);
		String expected = "Contacts";
		Assert.assertTrue(contactspage.waitUntilTitleContains(expected));
		
		
	}
	
	@Test 
	
	public void TestCase29_ViewContact() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		contactspage.clickselectedRecentContact();
		report.logTestInfo("click on the contact from recent created");
	//	String ExpectedPage = "Contact: Kabira ~ Salesforce - Developer Edition";
	//	String actualPage = "Contact: Kabira ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = contactspage.getTitleOfContactPage();
		System.out.println("TC29 title of page:"+actualPage);
		String expected = "Contact";
		Assert.assertTrue(contactspage.waitUntilTitleContains(expected));
		
	}
	
	@Test 
	
	public void TestCase30_NewViewError() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newViewContpage.clickCreateNewViewContact();
		report.logTestInfo("click on create new view in contact");
		
		newViewContpage.setViewUniqueNameContact("EFGH");
		report.logTestInfo("enter the view unique name");
		newViewContpage.clickViewSaveButton();
		report.logTestInfo("click on the save button");
		String ExpectedError = "Error: You must enter a value";
		String actualError = newViewContpage.getTextViewError();
		report.logTestInfo("Display error message");
		
		System.out.println("The error msg is: "+newViewContpage.getTextViewError());
		Assert.assertEquals(actualError, ExpectedError);
		
				
	}
	
	@Test 
	
	public void TestCase31_CheckCancelButton() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newViewContpage.clickCreateNewViewContact();
		report.logTestInfo("click on create new view in contact");
		newViewContpage.setViewNameContact("ABCD");
		report.logTestInfo("enter the view name");
		newViewContpage.setViewUniqueNameContact("EFGH");
		report.logTestInfo("enter the view unique name");
		contactspage.clickCancelButton();
		report.logTestInfo("Click on cancel button");
		//String ExpectedPage = "Contacts: Home ~ Salesforce - Developer Edition";
		//String actualPage = "Contacts: Home ~ Salesforce - Developer Edition";
		//Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = contactspage.getTitleOfContactPage();
		System.out.println("TC31 title of page:"+actualPage);
		String expected = "Contacts";
		Assert.assertTrue(contactspage.waitUntilTitleContains(expected));
	
		
	}
	
	@Test 
	
	public void TestCase32_CheckSaveNewButton() {
		loginpage.login_App();
		report.logTestInfo("Successfully login : Displaying Home Page");
		homepage.clickContactTab();
		report.logTestInfo("Click on Contact Tab on Home page");
		homepage.handleLightDialogue();
		report.logTestInfo("handle lightning Dialogue box");
		newContpage.clickNewContactButton();
		report.logTestInfo("click on new contact button");
		newContpage.setLastName("Abcd");
		report.logTestInfo("Enter the last name");
		newContpage.setAccName("Dimond");
		report.logTestInfo("Enter the Account name");
		newContpage.clickSaveNewButton();
		report.logTestInfo("Click on save and new button");
	//	String ExpectedPage = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
	//	String actualPage = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
	//	Assert.assertEquals(actualPage, ExpectedPage);
		String actualPage = newContpage.getTitleOfNewContactPage();
		System.out.println("TC32 title of page:"+actualPage);
		String expected = "Contact";
		Assert.assertTrue(newContpage.waitUntilTitleContains(expected));
	}

}
