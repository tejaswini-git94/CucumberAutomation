package com.flipkart.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultspage{
	private WebDriver driver;

    public Searchresultspage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//span[contains(text(),'Showing')]")
    WebElement searchResultsLabel;
    
    @FindBy(xpath="(//div[@class='_1HmYoV _35HD7C']/div[div[@class='_3O0U0u']])[1]")
    WebElement firstProduct;
    
    public  void validateSearchResultsPage() {
    	searchResultsLabel.isDisplayed();
	}

    public void clickFirstProductInSearchResultsPage()
    {
    	firstProduct.click();
    }
    
    
}
