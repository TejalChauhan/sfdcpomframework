package com.SalesForceApp.pages.UserMenuPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class MySettingUserMenu extends BasePage{
	public MySettingUserMenu(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(linkText = "My Settings") WebElement mySettings;
	@FindBy(xpath = "//span[@id='PersonalInfo_font']") WebElement Personal;
	@FindBy(xpath = "//span[@id='LoginHistory_font']") WebElement loginHistory;
	@FindBy(xpath = "//a[contains(text(),'Download')]") WebElement Download;
	@FindBy(xpath = "//span[@id='CalendarAndReminders_font']") WebElement Calender; 
	@FindBy(xpath = "//a/span[@id='Reminders_font']") WebElement CalenderActivity;
	@FindBy(xpath = "//input[@id='testbtn']") WebElement openCalender;
	@FindBy(xpath = "//span[@id='DisplayAndLayout_font']") WebElement display_Layout;
	@FindBy(xpath = "//span[@id='CustomizeTabs_font']") WebElement CustomizeMyTabs;
	@FindBy(xpath = "//select[@id='p4']") WebElement CustomApp;
	@FindBy(xpath = "//select[@id='duel_select_1']/option") List<WebElement>  SelectedTabs;
	@FindBy(xpath = "//select[@id='duel_select_0']") WebElement AvailableTab;
	@FindBy(xpath = "//a[@id='duel_select_0_right']/img") WebElement AddTab_btn;
	@FindBy(xpath = "//input[@name='save']") WebElement save;
	@FindBy(xpath = "//a[@class='header setupFolder']/span[contains(text(),'Email')]") WebElement email;
	@FindBy(xpath = "//a[@id='EmailSettings_font']/span[contains(text(),'Email')]") WebElement emailsetting;
	@FindBy(xpath = "//input[@id='sender_name']") WebElement emailname;
	@FindBy(xpath = "//input[@id='sender_email']") WebElement emailsender;
	@FindBy(xpath = "//input[@id='auto_bcc1']") WebElement BCCemail;
	@FindBy(xpath = "//input[@name='save']") WebElement saveemaildetail;
	
	
	
	
	
	public void clickMySetting() {
		waituntilVisible(mySettings);
		clickElelement(mySettings);
	}
	public void clickPersonalLink() {
		waituntilVisible(Personal);
		clickElelement(Personal);
	}
	public void clickLoginHistory() {
		waituntilVisible(loginHistory);
		clickElelement(loginHistory);
	}
	public void clickDownload() {
		waituntilVisible(Download);
		clickElelement(Download);
	}
	public void clickCalenderLink() {
		waituntilVisible(Calender);
		Calender.click();
	}
	public void clickCalenderActivity() {
		waituntilVisible(CalenderActivity);
		CalenderActivity.click();
	}
	public void clickOpenCalender() {
		waituntilVisible(openCalender);
		openCalender.click();
	}
	public void clickDisplayLayout() {
		waituntilVisible(display_Layout);
		clickElelement(display_Layout);
	}
	public void clickCustomizedMyTab() {
		waituntilVisible(CustomizeMyTabs);
		clickElelement(CustomizeMyTabs);
	}
	public void selectCustomApp() {
		Select S_Chatter = new Select(CustomApp);
		S_Chatter.selectByVisibleText("Salesforce Chatter");
	}
	public void VerifyaddReportTab() {
		String reporttab = "Reports";
		boolean reportflag = false; 
		System.out.println(SelectedTabs.size());
		for(WebElement tabs: SelectedTabs)
		{
			String comparereport = tabs.getText();
			if(reporttab.equalsIgnoreCase(comparereport))
			{
				reportflag = true;
			}
				
		}
		System.out.println("report flag:"+reportflag);
		if(!reportflag)
		{
			Select selectreporttab = new Select(AvailableTab);
			selectreporttab.selectByVisibleText("Reports");
			AddTab_btn.click();
			
		}
	}
	public void clickSaveButton() {
		waituntilVisible(save);
		clickElelement(save);
	}
	public void clickEmaillink() {
	  waituntilVisible(email);
	  clickElelement(email);
	}
	public void clickEmailSettinglink() {
		waituntilVisible(emailsetting);
		clickElelement(emailsetting);
		
	}
	public void setEmailname(String ename) {
		waituntilVisible(emailname);
		enterText(emailname, ename);
	}
	public void setEmailSender(String eSender) {
		waituntilVisible(emailsender);
		enterText(emailsender, eSender);
	}
	public void clickBCCEmail() {
		waituntilVisible(BCCemail);
		clickElelement(BCCemail);
	}
	public void clickSaveEmailDetail() {
		waituntilVisible(saveemaildetail);
		clickElelement(saveemaildetail);
	}
	

}
