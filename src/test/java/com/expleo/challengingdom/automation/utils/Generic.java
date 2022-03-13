package com.expleo.challengingdom.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic {
	
	public static WebDriver driver; 
	
	 public boolean validateButton(By object)
	    {
	      
	        return driver.findElement(object).isDisplayed();

	    }
	 
	 public boolean validateButtonIsEnabled(By object)
	    {
	      
	        return driver.findElement(object).isEnabled();

	    }
	 
	 public void waitForElement(By object)
	 {
		 WebDriverWait wait= new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(object));
	 }
	 
	 public String getText(By object)
	 {
		 return driver.findElement(object).getText();
	 }
	 
	
	 
}
