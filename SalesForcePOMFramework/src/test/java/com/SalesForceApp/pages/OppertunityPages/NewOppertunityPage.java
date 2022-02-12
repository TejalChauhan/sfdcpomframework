package com.SalesForceApp.pages.OppertunityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class NewOppertunityPage extends BasePage{
	public  NewOppertunityPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath = "//input[@title='New']")
	WebElement newOpp;
	@FindBy(xpath = "//input[@id='opp3']")
	WebElement oppName;
	@FindBy(xpath = "//input[@id='opp4']")
	WebElement AccName;
	@FindBy(xpath = "//input[@id='opp9']")
	WebElement closedate;
	@FindBy(xpath = "//select[@id='opp11']")
	WebElement stage_DD;
	@FindBy(xpath = "//input[@id='opp12']")
	WebElement prob;
	@FindBy(xpath = "//select[@id='opp6']")
	WebElement leadsource;
	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement save;
	
	public void clickNewOppertunity() {
		waituntilVisible(newOpp);
		clickElelement(newOpp);
	}
	public void setOppertunityName(String oppertunityName) {
		waituntilVisible(oppName);
		enterText(oppName, oppertunityName);
	}
	public void setOppAccountName(String oppAccountName) {
		waituntilVisible(AccName);
		enterText(AccName, oppAccountName);
	}
	public void setOppCloseDate(String date) {
		waituntilVisible(closedate);
		enterText(closedate, date);
	}
	public void selectStageDD() {
		waituntilVisible(stage_DD);
		Select selectstage = new Select(stage_DD);
		selectstage.selectByVisibleText("Qualification");
		
	}
	public void setProb(String probtext) {
		waituntilVisible(prob);
		enterText(prob, probtext);
	}
	public void selectLeadSource() {
		waituntilVisible(leadsource);
		Select selectSource = new Select(leadsource);
		selectSource.selectByVisibleText("Other");
	}
	public void clicksave() {
		waituntilVisible(save);
		clickElelement(save);
	}

}
