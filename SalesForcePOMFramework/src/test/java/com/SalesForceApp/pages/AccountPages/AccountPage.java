package com.SalesForceApp.pages.AccountPages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class AccountPage extends BasePage{
	public AccountPage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath = "//input[@name='new']") WebElement account_newbtn;
	@FindBy(xpath = "//input[@id='acc2']") WebElement  accountname;
	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']") WebElement account_savebtn;
	
	
	
	
	
	
	
	public void clickAccountNewButton() {
		waituntilVisible(account_newbtn);
		clickElelement(account_newbtn);
	}
	public void setAccountName(String accName) {
		waituntilVisible(accountname);
		enterText(accountname, accName);
	}
	public void clickAccountSaveButton() {
		waituntilVisible(account_savebtn);
		clickElelement(account_savebtn);
	}
	public String getTitleofAccountPage() {
		String title = driver.getTitle();
		System.out.println("title of Page : "+title);
		return title;
	}
	
	
	
	
	
	
	
	
	
}