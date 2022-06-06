package com.lexnod.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.WebDriverCommonLib;

public class CreatePotentialPage {
	
	@FindBy(name="property(Potential Name)") private WebElement potentialNameTextBox;
	@FindBy(name="property(Amount)") private WebElement amountTextBox;
	@FindBy(name="property(Closing Date)") private WebElement closingDateTextBox;
	@FindBy(xpath = "//img[@title='Account Name Lookup']") private WebElement accountNameLookupImage;
	@FindBy(name="property(Account Name)") private WebElement accountNameTextBox;
	@FindBy(name="property(Stage)") private WebElement stageDropDown;
	@FindBy(name="property(Type)") private WebElement typeDropDown;
	@FindBy(name="property(Probability)") private WebElement probabilityTextBox;
	@FindBy(name="property(Next Step)") private WebElement nextStepTextBox;
	@FindBy(name="property(Lead Source)") private WebElement leadSourceDropDown;
	@FindBy(id="Campaign Source") private WebElement campaignSourceTextBox;
	@FindBy(xpath = "//img[@title='Campaign Name Lookup']") private WebElement campaignSourceLookupImage;
	@FindBy(name="property(Description)") private WebElement descriptionTextBox;
	@FindBy(xpath = "//td[contains(text(),' Description Information')]/ancestor::table[@id='secHead2']/following-sibling::table[@cellspacing='0']//child::input[@type='submit']")
			private WebElement saveButton;
	

	
	public CreatePotentialPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	

	public WebElement getPotentialNameTextBox() {
		return potentialNameTextBox;
	}
	
	public void potentialNameTextBox(String potentialName)
	{
		potentialNameTextBox.sendKeys(potentialName);
	}

	

	public WebElement getAmountTextBox() {
		return amountTextBox;
	}
	
	public void amountTextBox(String amount) {
		amountTextBox.sendKeys(amount);
	}



	public WebElement getClosingDateTextBox() {
		return closingDateTextBox;
	}
	
	public void closingDateTextBox(String closingDate) {
		closingDateTextBox.sendKeys(closingDate);
	}



	public WebElement getAccountNameLookupImage() {
		return accountNameLookupImage;
	}
	


	public WebElement getAccountNameTextBox() {
		return accountNameTextBox;
	}
	
	public void accountNameTextBox(String accountName) {
		accountNameTextBox.sendKeys(accountName);
	}



	public WebElement getStageDropDown() {
		return stageDropDown;
	}
	
	public void stageDropDown(String stageText) {
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(stageText, stageDropDown);
	}
	


	public WebElement getTypeDropDown() {
		return typeDropDown;
	}
	
	public void typeDropDown(String typeText) {
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(typeText, typeDropDown);
	}



	public WebElement getProbabilityTextBox() {
		return probabilityTextBox;
	}
	
	public void probabilityTextBox(String probability) {
		probabilityTextBox.sendKeys(probability);
	}



	public WebElement getNextStepTextBox() {
		return nextStepTextBox;
	}
	
	public void nextStepTextBox(String nextStep) {
		nextStepTextBox.sendKeys(nextStep);
	}



	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}
	
	public void leadSourceDropDown(String leadSourceText) {
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(leadSourceText, leadSourceDropDown);
	}



	public WebElement getCampaignSourceTextBox() {
		return campaignSourceTextBox;
	}
	
	public void campaignSourceTextBox(String campaignSource) {
		campaignSourceTextBox.sendKeys(campaignSource);
	}



	public WebElement getCampaignSourceLookupImage() {
		return campaignSourceLookupImage;
	}
	


	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}
	
	public void descriptionTextBox(String description) {
		descriptionTextBox.sendKeys(description);
	}



	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void saveButton() {
		saveButton.click();
	}
	
}
