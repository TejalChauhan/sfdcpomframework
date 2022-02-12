package com.SalesForceApp.pages.RandomScenarioPages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class RandomScenarioPage extends BasePage{
	
	public RandomScenarioPage(WebDriver driver)
	{
		super(driver);
		
	}

	@FindBy(xpath = "//h1[@class='currentStatusUserName']//a") WebElement UserLink;
			
	//TC36 & 37
	@FindBy(xpath = "//span[@class='pageDescription']//a") WebElement currentDate;
	@FindBy(xpath = "//div[@id='p:f:j_id25:j_id61:28:j_id64']//a") WebElement EightPM;
	@FindBy(xpath = "//img[@title='Subject Combo (New Window)']") WebElement SubjectCombo;
	@FindBy(xpath = "//li[@class='listItem4']//a[1]") WebElement other;
	@FindBy(xpath = "//input[@id='EndDateTime_time']") WebElement Endtime;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']") WebElement save_Event;
	@FindBy(xpath = "//a[normalize-space()='4:00 PM']")  WebElement FourPM;
	@FindBy(xpath = "//input[@id='RecurrenceEndDateOnly']")  WebElement Enddate;
	@FindBy(xpath = "//input[@id='IsRecurrence']") WebElement Recurrence;
	@FindBy(xpath = "//input[@id='rectypeftw']") WebElement weekRbtn;
	@FindBy(xpath = "//img[@title='Month View']") WebElement monthview;
	
	
	
	
	
	public void clickFirstnameLastnameLink() {
		
		waituntilVisible(UserLink);
		clickElelement(UserLink);
	}
	
	
	public void SwitchBackToDefalut() {
		SwitchToDefaultContent();
	}
	
	public void clickCurrentDate() {
		waituntilVisible(currentDate);
		 clickElelement(currentDate);
	}
	public void clickEightPMlink() {
		 waituntilVisible(EightPM);
		 clickElelement(EightPM);
	}
	public void clickOther() {
		waituntilVisible(other);
		 clickElelement(other);
	}
	public void setEndTime(String time)
	{
		 waituntilVisible(Endtime);
		 enterText(Endtime, "9:00 PM");
	}
	public void clickSaveEvent() {
		waituntilVisible(save_Event);
		mouseOver(save_Event);
		clickElelement(save_Event);
	}
	public void clickSubjectCombo() {
        waituntilVisible(SubjectCombo);
		clickElelement(SubjectCombo);
	}
	public void clickFourPMlink() {
		 waituntilVisible(FourPM);
		 clickElelement(FourPM);
	}
	public void clickRecurenceRadiobtn() {
		if(!Recurrence.isSelected())
		 {
			 Recurrence.click();
		 }
	}
	public void clickWeekRadiobutton() {
		 if(!weekRbtn.isSelected())
		 {
			 weekRbtn.click();
		 }
		
	}
	public void setEndDateafter2weeks() {
		 SimpleDateFormat dtf = new SimpleDateFormat("MM/dd/yyyy");
	     Calendar calendar = Calendar.getInstance();
         calendar.add(Calendar.WEEK_OF_YEAR, 2);
	     java.util.Date dateObj = calendar.getTime();
	     String formattedDate = dtf.format(dateObj);
	     Enddate.sendKeys(formattedDate);
	     
	}
	public void clickMonthView() {
		waituntilVisible(monthview);
		 mouseOver(monthview);
	     clickElelement(monthview);
	}
	
	
	
	
}
