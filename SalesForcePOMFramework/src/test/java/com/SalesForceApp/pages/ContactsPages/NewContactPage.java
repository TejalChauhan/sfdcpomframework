package com.SalesForceApp.pages.ContactsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class NewContactPage extends BasePage{
	
	public NewContactPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@title='New']")
	WebElement new_btn;
	@FindBy(xpath = "//input[@id='name_lastcon2']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='con4']")
	WebElement AccName;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	WebElement save;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save & New']")
	WebElement SaveNew_btn;
	
	public void clickNewContactButton() {
		waituntilVisible(new_btn);
		clickElelement(new_btn);
	}
	public void setLastName(String lname) {
		waituntilVisible(lastname);
		enterText(lastname, lname );
	}
	public void setAccName(String Aname) {
		waituntilVisible(AccName);
		enterText(AccName, Aname);
	}
	public void clickSaveButton() {
		waituntilVisible(save);
		clickElelement(save);
	}
	public void clickSaveNewButton(){
		waituntilVisible(SaveNew_btn);
		clickElelement(SaveNew_btn);
	}
	public String getTitleOfNewContactPage() {
		String title = getTitleOfThePage();
		return title;
	}

}
