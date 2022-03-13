package com.expleo.challengingdom.automation.stepDefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.expleo.challengingdom.automation.constants.Constants;
import com.expleo.challengingdom.automation.pages.ChallengingDomPage;
import com.expleo.challengingdom.automation.pages.GitHubPage;
import com.expleo.challengingdom.automation.pages.SeleniumPage;
import com.expleo.challengingdom.automation.utils.Generic;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChallengingDomSteps extends Generic {

	@Given("application is launched")
	public void application_is_launched() {

		System.setProperty("webdriver.chrome.driver",
				Constants.PROJECT_DIRECTORY+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constants.CHALLENGING_DOM_URL);
	}

	@Then("user should be on the home page")
	public void user_should_be_on_the_home_page() {

		waitForElement(ChallengingDomPage.challengingDomText);
		new ChallengingDomPage().verifyTitle();

	}

	@And("user should see all the three buttons")
	public void user_should_see_all_the_three_buttons() {

		new ChallengingDomPage().verifyButtons();
	}

	@Then("user should be able to click all the three buttons")
	public void user_should_be_able_to_click_all_the_three_buttons() {

		new ChallengingDomPage().verifyButtonIsClickable();
	}

	@Then("user clicks on the github link")
	public void user_clicks_on_the_github_link() {

		new ChallengingDomPage().clickOnTheGitHubLink();
	}

	@Then("user should navigate to github page")
	public void user_should_navigate_to_github_page() {

		new GitHubPage().verifyGitHubPageTitle();
	}

	@Then("user should see {string} text on the page")
	public void user_should_see_text_on_the_page(String githubLinkText) {

		new ChallengingDomPage().verifyGitHubLinkText(githubLinkText);
	}

	@Then("user clicks on the footer link")
	public void user_clicks_on_the_footer_link() {

		new ChallengingDomPage().clickOnTheFooterLink();
	}

	@Then("user should navigate to element selenium page")
	public void user_should_navigate_to_element_selenium_page() {

		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			if (window != parentWindow)
				driver.switchTo().window(window);
		}

		new SeleniumPage().verifySeleniumPageTitle();

	}

	@Then("user should see the footer text")
	public void user_should_see_the_footer_text() {

		new ChallengingDomPage().verifyFooterText();
	}

	@Then("user should see the correct header of the table on the page")
	public void user_should_see_the_correct_header_of_the_table_on_the_page() {

		new ChallengingDomPage().verifyTableHeaders();

	}

	@Then("user should see delete and edit link on the page")
	public void user_should_see_delete_and_edit_link_on_the_page() {

		new ChallengingDomPage().verifyEditAndDeleteLink();

	}

	@Then("user should see ten rows of data in the table")
	public void user_should_see_ten_rows_of_data_in_the_table() {

		new ChallengingDomPage().verifyRowsOfTable();
	}

	@After
	public void cleanUp() {

		driver.quit();
	}

}
