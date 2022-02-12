package com.SalesForceApp.pages.AccountPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class MergeAccountPage extends BasePage{
	
	public MergeAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(css = "a[href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']")
	WebElement MergeAccount;
	@FindBy(css = "#srch")
	WebElement Merge_accountname;
	@FindBy(css = "input[title='Find Accounts'][value='Find Accounts']")
	WebElement findaccount;
	@FindBy(xpath = "//input[@id='cid0']")
	WebElement checked_firstaccount;
	@FindBy(xpath = "//input[@id='cid1']")
	WebElement checked_secondaccount;
	@FindBy(css = "div[class='pbBottomButtons'] input[title='Next']")
	WebElement  Merge_Nextbtn;
	@FindBy(xpath = "//div[@class='pbBottomButtons']//input[@title='Merge']")
	WebElement Merge_btn;
	
	public void clickMergeAccount() {
		waituntilVisible(MergeAccount);
		clickElelement(MergeAccount);
	}
	public void setMergeAccountName(String m_accountname) {
		waituntilVisible(Merge_accountname);
		enterText(Merge_accountname, m_accountname);
	}
	public void clickFindMergeAccount() {
		waituntilVisible(findaccount);
		clickElelement(findaccount);
	}
	public void checkFirstAccount() {
		waituntilVisible(checked_firstaccount);
		clickElelement(checked_firstaccount);
	}
	public void checkSecondAccount() {
		waituntilVisible(checked_secondaccount);
		clickElelement(checked_secondaccount);
	}
	public void clickMergeNextButton() {
		waituntilVisible(Merge_Nextbtn);
		clickElelement(Merge_Nextbtn);
	}
	public void clickMergeButton() {
		waituntilVisible(Merge_btn);
		clickElelement(Merge_btn);
		waituntilAlertPresent();
		acceptAlert();
	}

}
