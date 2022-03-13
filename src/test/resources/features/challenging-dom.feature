Feature: Validate Challenging dom application

  Background:
    Given application is launched

  @DomApplicationValidation @ApplicationLaunchValidation
  Scenario: To validate challenging dom application is launched successfully
    Then user should be on the home page
    
  @DomApplicationValidation @ApplicationButtonValidation
  Scenario: To validate all three buttons are present in application homepage
    Then user should be on the home page
    And user should see all the three buttons
   
  @DomApplicationValidation @ApplicationButtonValidation
  Scenario: To validate all the three buttons are clickable in application homepage
    Then user should be on the home page
    And user should be able to click all the three buttons
     
  @DomApplicationValidation @GitHubLinkValidation
  Scenario: To validate user should navigate to github page on clicking github link text
    Then user should be on the home page 
    And user clicks on the github link
    Then user should navigate to github page

  @DomApplicationValidation @ForkMeOnGithubTextValidation
  Scenario: To validate text of fork me on Github on challenging dom application
    Then user should be on the home page
    And user should see "Fork me on GitHub" text on the page
    
  @DomApplicationValidation @FooterLinkValidation
  Scenario: To validate user should navigate to element Selenium page on clicking footer link
    Then user should be on the home page
    And user clicks on the footer link
    Then user should navigate to element selenium page    
    
  @DomApplicationValidation @FooterTextValidation
  Scenario: To validate footer text is present in application homepage
    Then user should be on the home page
    And user should see the footer text
    
  @DomApplicationValidation @TableHeaderTextValidation
  Scenario: To validate header of the table on the application
    Then user should be on the home page
    Then user should see the correct header of the table on the page
    
  @DomApplicationValidation @TableRowsValidation
  Scenario: To validate table should have ten rows
    Then user should be on the home page
    Then user should see ten rows of data in the table
    
  @DomApplicationValidation @EditAndDeleteLinkValidation
  Scenario: To validate edit and delete link is present for each rows in the table
    Then user should be on the home page
    Then user should see delete and edit link on the page