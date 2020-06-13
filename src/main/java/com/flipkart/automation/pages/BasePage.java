package com.flipkart.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;

public class BasePage {
WebDriver driver;
			    
	    public BasePage(WebDriver driver){

	        this.driver = driver;
	        PageFactory.initElements(driver, this);

	    }
	 


			
}
