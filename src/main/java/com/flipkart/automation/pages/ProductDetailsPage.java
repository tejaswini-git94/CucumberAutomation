package com.flipkart.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage{


    public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[@class='_35KyD6']")
    WebElement productTitle;
    
    @FindBy(xpath="//button[contains(.,'BUY NOW')]")
    WebElement btn_BuyNow;
    
    
    public void verifyProductDetailsLabel()
    {
    	productTitle.isDisplayed();
    }
    
    public void clickBuyNowBtn()
    {
    	btn_BuyNow.click();	
    }
    
    
}
