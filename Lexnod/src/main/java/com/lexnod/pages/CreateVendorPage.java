package com.lexnod.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lexnod.GenericLib.BaseTest;

public class CreateVendorPage {

	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement phoneTextBox;
	@FindBy(xpath = "//input[@name='property(Website)']")
	private WebElement websiteTextBox;
	@FindBy(xpath = "//input[@name='property(Vendor Name)']")
	private WebElement vendorNameTextBox;
	@FindBy(xpath = "//td[contains(text(),'Vendor Information')]/ancestor::table[@id='secHead1']/preceding-sibling::table[1]//child::input[@value='Save']")
	private WebElement saveButton;

	public CreateVendorPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}

	public WebElement getWebsiteTextBox() {
		return websiteTextBox;
	}

	public WebElement getVendorNameTextBox() {
		return vendorNameTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void createVendor(String phone, String website, String vendorName) {
		phoneTextBox.sendKeys(phone);
		websiteTextBox.sendKeys(website);
		vendorNameTextBox.sendKeys(vendorName);
		saveButton.click();

	}

}
