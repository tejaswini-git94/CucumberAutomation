package com.flipkart.automation.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.automation.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePageStepDefs extends BaseTest {
	//public WebDriver driver;
	Homepage hp;
	
 @Given("^user is on the home page$")
    public void the_user_opens_the_application(){
        try {
        	
        	driver.get("http://flipkart.com");
        	hp=new Homepage(driver);
        	hp.closePopup();
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
                    
	}
 
 @When("^user search for \"(.*?)\"$")
 public void user_serach_for_item(String item)
 {
	try {
		hp.searchForAProduct(item);
	}
	catch(Exception e)
	{}
	 
 }


}