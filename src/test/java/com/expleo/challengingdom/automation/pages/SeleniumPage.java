package com.expleo.challengingdom.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.expleo.challengingdom.automation.utils.Generic;

public class SeleniumPage extends Generic {
	
	public static By headerText = By.xpath("//h1[text()='Elemental Selenium']");
	
	public void verifySeleniumPageTitle() {
		waitForElement(headerText);
		Assert.assertTrue("Selenium Page is not dispalyed",driver.findElement(headerText).isDisplayed() );
	}
	
  
}
