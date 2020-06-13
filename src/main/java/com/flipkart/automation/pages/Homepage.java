package com.flipkart.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{

		
	private WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}

		
		@FindBy(xpath="//button[text()='✕']")
		WebElement closeButton_HomePage;

	    @FindBy(name="q")
	    WebElement searchTextBox_HomePage;    

	    @FindBy(xpath="//button[@class='vh79eN']")
	    WebElement searchButton;

	    
	    
	    public void openBrowserUrl(String url)
	    {
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        	driver=new ChromeDriver();
        	driver.get(url);
        	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
	    }
	
		public  void closePopup() {
			closeButton_HomePage.click();
		}
		
		public void searchForAProduct(String item)
		{
			searchTextBox_HomePage.sendKeys(item);
			searchButton.click();
		}

	
}
