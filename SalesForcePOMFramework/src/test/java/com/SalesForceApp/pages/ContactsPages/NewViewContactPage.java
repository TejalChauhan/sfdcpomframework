package com.SalesForceApp.pages.ContactsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class NewViewContactPage extends BasePage{
	public NewViewContactPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[@class='fFooter']//a[contains(text(),'Create New')]")
	WebElement createNewView;
	@FindBy(xpath = "//input[@id='fname']")
	WebElement ViewName;
	@FindBy(xpath = "//input[@id='devname']")
	WebElement ViewUniqueName;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]") 
	WebElement Viewsave_btn;
	@FindBy(xpath = "//div[@class='requiredInput']//div[@class='errorMsg']")
	WebElement newviewerror;
	
	public void clickCreateNewViewContact() {
		waituntilVisible(createNewView);
		clickElelement(createNewView);
	}
	public void setViewNameContact(String vname) {
		waituntilVisible(ViewName);
		enterText(ViewName, vname);
	}
	public void setViewUniqueNameContact(String vuniquename) {
		waituntilVisible(ViewUniqueName);
		clickElelement(ViewUniqueName);
		ViewUniqueName.clear();
		enterText(ViewUniqueName, vuniquename);
	}
	public void clickViewSaveButton() {
		waituntilVisible(Viewsave_btn);
		clickElelement(Viewsave_btn);
	}
	public String getTitleOfNewViewContactPage() {
		String title = getTitleOfThePage();
		return title;
	}
	public String getTextViewError() {
		return newviewerror.getText();
	}

}
