package com.SalesForceApp.pages.ContactsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class ContactsPage extends BasePage{
	public ContactsPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//select[@id='hotlist_mode']")
	WebElement recentCreated;
	@FindBy(xpath = "//select[@id='fcf']")
	WebElement myContact;
	@FindBy(xpath = "//a[contains(text(),'Kabira')]")
	WebElement selectrecentContact;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement cancelbtn;
	
	
	
	
	public void selectRecentCreated() {
		waituntilVisible(recentCreated);
		Select selectrecent = new Select(recentCreated);
		selectrecent.selectByVisibleText("Recently Created");
	}
	public void selectMyContact() {
		waituntilVisible(myContact);
		Select selectMy = new Select(myContact);
		selectMy.selectByVisibleText("ContactViewDimond");
	}
	public void clickselectedRecentContact() {
		waituntilVisible(selectrecentContact);
		clickElelement(selectrecentContact);
	}
	public void clickCancelButton() {
		waituntilVisible(cancelbtn);
		clickElelement(cancelbtn);
	}
	public String getTitleOfContactPage() {
		String title = getTitleOfThePage();
		return title;
	}
	
	
	

}
