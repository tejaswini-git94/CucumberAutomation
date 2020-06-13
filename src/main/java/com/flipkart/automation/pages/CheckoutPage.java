package com.flipkart.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {



    public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@class='_2zrpKA _3X0qwn']")
    WebElement txt_Email;

    @FindBy(xpath="//span[text()='CONTINUE']")
    WebElement btn_Continue;
    
    
    
}
