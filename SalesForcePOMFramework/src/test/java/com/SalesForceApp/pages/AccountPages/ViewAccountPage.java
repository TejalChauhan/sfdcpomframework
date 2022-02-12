package com.SalesForceApp.pages.AccountPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class ViewAccountPage extends BasePage{
	public ViewAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	WebElement createNewView;
	@FindBy(xpath = "//input[@id='fname']")
	WebElement Viewname;
	@FindBy(xpath = "//input[@id='devname']")
	WebElement ViewUniquename;
	@FindBy(css = "body > div:nth-child(4) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(3) > form:nth-child(1) > div:nth-child(13) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")
	WebElement View_savebtn;
	@FindBy(css = "#fcf")
	WebElement View_DD;
	@FindBy(xpath = "//a[normalize-space()='Edit']")
	WebElement Edit_View;
	@FindBy(xpath = "//select[@id='fcol1']")
	WebElement FilterByField;
	@FindBy(xpath = "//select[@id='fop1']")
	WebElement selectoperator;
	@FindBy(xpath = "//input[@id='fval1']")
	WebElement value;
	@FindBy(xpath = "//select[@id='colselector_select_1']/option")
	List<WebElement>  Selectedfield;
	@FindBy(xpath = "//select[@id='colselector_select_0']")
	WebElement Availablefield;
	@FindBy(xpath = "//a[@id='colselector_select_0_right']/img")
	WebElement Add_image;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement save_field;
	
	public void clickCreateNewView() {
		waituntilVisible(createNewView);
		clickElelement(createNewView);
	}
	public void setViewName(String vname) {
		waituntilVisible(Viewname);
		enterText(Viewname, vname);
	}
	public void setViewUniqueName(String vUniquename) {
		waituntilVisible(ViewUniquename);
		enterText(ViewUniquename, vUniquename);
	}
	public void clickViewSaveButton() {
		waituntilVisible(View_savebtn);
		clickElelement(View_savebtn);
	}
	public void selectCreatedViewFromDD(String selectVisibleText) {
		waituntilVisible(View_DD);
		Select selectView = new Select(View_DD);
		selectView.selectByVisibleText(selectVisibleText);
	}
	public void clickEditView() {
		waituntilVisible(Edit_View);
		clickElelement(Edit_View);
	}
	public void selectFilterByField() {
		waituntilVisible(FilterByField);         	
		Select selectfield = new Select(FilterByField);
		selectfield.selectByVisibleText("Account Name");
	}
	public void selectOperator() {
		waituntilVisible(selectoperator);
		Select selectOperator = new Select(selectoperator);
		selectOperator.selectByVisibleText("contains");
	}
	public void setValue(String valuetext) {
		waituntilVisible(value);
		enterText(value, valuetext);
	}
	public void addLastActivityField() {
		String activityfield = "Last Activity";
		boolean activityflag = false; 
		System.out.println(Selectedfield.size());
		for(WebElement fields: Selectedfield)
		{
			String compareactivity = fields.getText();
			if(activityfield.equalsIgnoreCase(compareactivity))
			{
				activityflag = true;
			}
				
		}
		System.out.println("activity flag:"+activityflag);
		if(!activityflag)
		{
			Select selectLastactivity = new Select(Availablefield);
			selectLastactivity.selectByVisibleText("Last Activity");
			Add_image.click();
			
		}
	}
	public void clickSaveFieldButton() {
		waituntilVisible(save_field);
		clickElelement(save_field);
	}

}
