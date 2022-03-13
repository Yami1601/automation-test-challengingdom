package com.expleo.challengingdom.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.expleo.challengingdom.automation.utils.Generic;

public class GitHubPage extends Generic {

	public static By saucelabsText = By.xpath("//a[text()='saucelabs']");

	public void verifyGitHubPageTitle() {
		waitForElement(saucelabsText);
		Assert.assertTrue("Git hub Page is not dispalyed", driver.findElement(saucelabsText).isDisplayed());
	}
}
