package com.expleo.challengingdom.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.expleo.challengingdom.automation.constants.Constants;
import com.expleo.challengingdom.automation.utils.Generic;

public class ChallengingDomPage extends Generic {

	public static By challengingDomText = By.xpath("//h3[text()='Challenging DOM']");
	public static By bazButton = By.xpath("//a[@class='button']");
	public static By alertButton = By.xpath("//a[@class='button alert']");
	public static By successButton = By.xpath("//a[@class='button success']");
	public static By githubLink = By.xpath("//img[@alt='Fork me on GitHub']");
	public static By footerLink = By.xpath("//a[@target='_blank']");
	public static By footerText = By.xpath("//div[text()='Powered by ']");
	public static By loremText = By.xpath("//th[text()='Lorem']");
	public static By ipsumText = By.xpath("//th[text()='Ipsum']");
	public static By dolarText = By.xpath("//th[text()='Dolor']");
	public static By sitText = By.xpath("//th[text()='Sit']");
	public static By ametText = By.xpath("//th[text()='Amet']");
	public static By diceretText = By.xpath("//th[text()='Diceret']");
	public static By actionText = By.xpath("//th[text()='Action']");

	public void verifyTitle() {

		Assert.assertTrue("Title is not displayed", driver.findElement(challengingDomText).isDisplayed());
	}

	public void verifyButtons() {

		Assert.assertTrue("Baz Button is not visible", validateButton(ChallengingDomPage.bazButton));
		Assert.assertTrue("Alert Button is not visible", validateButton(ChallengingDomPage.alertButton));
		Assert.assertTrue("Success Button is not visible", validateButton(ChallengingDomPage.successButton));
	}

	public void verifyButtonIsClickable() {

		Assert.assertTrue("Baz Button is not clickable", validateButtonIsEnabled(ChallengingDomPage.bazButton));
		Assert.assertTrue("Alert Button is not clickable", validateButtonIsEnabled(ChallengingDomPage.alertButton));
		Assert.assertTrue("Success Button is not clickable", validateButtonIsEnabled(ChallengingDomPage.successButton));
	}

	public void clickOnTheGitHubLink() {
		driver.findElement(githubLink).click();
	}

	public void verifyGitHubLinkText(String message) {
		Assert.assertEquals("", message, driver.findElement(githubLink).getAttribute("alt"));
	}

	public void clickOnTheFooterLink() {
		driver.findElement(footerLink).click();
	}

	public void verifyFooterText() {
		Assert.assertTrue("Footer text is not displayed", getText(footerText).contains("Powered by "));
	}

	public void verifyTableHeaders() {
		
		Assert.assertTrue("Lorem text is not displayed", getText(loremText).equals(Constants.LOREM));
		
		//pending other rows validation
 
	}
	
	public void verifyEditAndDeleteLink()
	{
		for (int i = 1; i <= 10; i++) {

           Assert.assertTrue("Edit and Delete in Row " +i+ "is not displayed", driver.findElement(By.xpath("(//a[text()='edit'])[" + i + "]")).isDisplayed() && (driver.findElement(By.xpath("(//a[text()='delete'])[" + i + "]"))).isDisplayed());
            
		}

   
	}
	
	public void verifyRowsOfTable()
	{
		
		 for (int i = 0; i <= 9; i++) {
          
           Assert.assertTrue("Row " +i+1+ "is not displayed", driver.findElement(By.xpath("//td[text()='Iuvaret" + i + "'" + "]")).isDisplayed());
             

            
         }
		
		
	}
}
