package com.SalesForceApp.pages.AccountPages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class UnSaveReportAccountPage extends BasePage {
	public UnSaveReportAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath = "//a[normalize-space()='Accounts with last activity > 30 days']")
	WebElement account_LastActivity;
	@FindBy(xpath = "//input[@id='ext-comp-1042']")
	WebElement fromdatetext;
	@FindBy(xpath = "//em/button[@id='ext-gen49']")
	WebElement  accountReport_savebtn;
	@FindBy(xpath = "//input[@id='saveReportDlg_reportNameField']")
	WebElement reportname;
	@FindBy(xpath = "//input[@id='saveReportDlg_DeveloperName']")
	WebElement reportUnique;
	@FindBy(css = "#dlgSaveAndRun")
	WebElement Report_SaveRunbtn;
	
	public void clickAccountLastAcitivity() {
		waituntilVisible(account_LastActivity);
		clickElelement(account_LastActivity);
	}
	public void setFromDate() {
		
		SimpleDateFormat dtf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();

        java.util.Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        waituntilVisible(fromdatetext);
        enterText(fromdatetext, formattedDate);
	}
	public void clickSaveAccountRportButton() {
		waituntilVisible( accountReport_savebtn);
		clickElelement(accountReport_savebtn);
	}
	public void setAccountReportName(String RName) {
		waituntilVisible(reportname);
		enterText(reportname, RName);
	}
	public void setAccountReportUniqueName(String RUniqueName) {
		waituntilVisible(reportUnique);
		enterText(reportUnique, RUniqueName);
	}
	public void clickReportSaveRunButton() {
		waituntilVisible(Report_SaveRunbtn);
		clickElelement(Report_SaveRunbtn);
	}
	

}
