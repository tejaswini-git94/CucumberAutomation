package com.flipkart.automation.stepdefs;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.flipkart.automation.pages.Searchresultspage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchResultsStepdefs extends BaseTest {
Searchresultspage sp;
//private WebDriver driver;
	@Then("^search results are displayed$")
	 public void search_results_are_displayed()
	 {
		try {
			sp=new Searchresultspage(driver);
			sp.validateSearchResultsPage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	 }

	@When("^user click on the first product$")
	 public void user_click_on_the_first_product()
	 {
		try {
			String parentWindow = driver.getWindowHandle();
			sp.clickFirstProductInSearchResultsPage();
			Thread.sleep(3000);
			
			
			
			Set<String> handles =  driver.getWindowHandles();
			   for(String windowHandle  : handles)
			       {
			       if(!windowHandle.equals(parentWindow))
			          {
			          driver.switchTo().window(windowHandle);
//			          driver.close(); //closing child window
//			         driver.switchTo().window(parentWindow); //cntrl to parent window
			          }
			       }
			   
		}
		catch(Exception e)
		{e.printStackTrace();}
		 
	 }

}
