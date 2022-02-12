package com.SalesForce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.utility.commonUtilities;
import com.SalesForceApp.Base.BaseTest;


public class LoginTest extends BaseTest{
	@Test 
	
	public void TestCase1_BlankPassword() {
		String username = commonUtilities.getApp_Property("username");
		loginpage.setUsername(username);
		report.logTestInfo("valid Username entered");
		String password = "";
		loginpage.setPassword(password);
		report.logTestInfo("Blank Password entered");
		loginpage.clickLoginButton();
		String expectedError = "Please enter your password.";
		String actulError = loginpage.getErrormsg();
		report.logTestInfo("Displaying error message : Please enter your password. ");
		System.out.println("Expected error message: "+expectedError);
		Assert.assertEquals(actulError, expectedError);
		
	}
	
	@Test 
	public void TestCase2_ValidUsernamePassword() {
		String username = commonUtilities.getApp_Property("username");
		loginpage.setUsername(username);
		report.logTestInfo("valid Username entered");
		String password = commonUtilities.getApp_Property("password");
		loginpage.setPassword(password);
		report.logTestInfo("Valid Password entered");
		loginpage.clickLoginButton();
		report.logTestInfo("Successfully login & Displaying Home Page");
		String expected = "Home Page";
		Assert.assertTrue(homepage.waitUntilTitleContains(expected));
		
	}
	
	@Test 
	public void TestCase3_RememberedUsername() {
		String username = commonUtilities.getApp_Property("username");
		loginpage.setUsername(username);
		report.logTestInfo("valid Username entered");
		String password = commonUtilities.getApp_Property("password");
		loginpage.setPassword(password);
		report.logTestInfo("Valid Password entered");
		loginpage.clickRememberMe();
		report.logTestInfo("checked Remember Me checkbox");
		loginpage.clickLoginButton();
		report.logTestInfo("Successfully login & Displaying Home Page");
		homepage.logoutHomepage();
		report.logTestInfo("logout from homepage");
		String RememberUsername = loginpage.getRemembedUserId();
		System.out.println(RememberUsername);
		System.out.println(username);
		report.logTestInfo("Remembered Username :"+RememberUsername);
		Assert.assertEquals(username,RememberUsername);
		
	}
	
	@Test 
	public void TestCase4A_ForgotPassword() {
		forgotpw.clickForgotPassword();
		report.logTestInfo("click on forgot password link");
		forgotpw.setUserId_ForgotPassword();
		report.logTestInfo("enter valid username");
		forgotpw.clickContinueButton();
		report.logTestInfo("click on continue button");
		String ExpectedPage = "Check Your Email | Salesforce";
		String ActualPage = forgotpw.getTitleOfForgotPasswordPage();
		System.out.println(ActualPage);
		report.logTestInfo("Displaying Check your Email page");
		Assert.assertEquals(ActualPage, ExpectedPage);
	 		
	}
	
	@Test 
	public void TestCase4B_InvalidUsernamePassword() {
		String username = "123";
		loginpage.setUsername(username);
		report.logTestInfo("Invalid Username entered");
		String password = "22132";
		loginpage.setPassword(password);
		report.logTestInfo("Invalid Password entered");
		loginpage.clickLoginButton();
		report.logTestInfo("click on login Button");
		String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actulError = loginpage.getErrormsg();
		report.logTestInfo("Displaying Error message");
		System.out.println("Expected error message: "+actulError);
		Assert.assertEquals(actulError, expectedError);
	}

}
