package com.flipkart.automation.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.automation.pages.Homepage;
import com.flipkart.automation.pages.ProductDetailsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ProductDetailsPageStepDefs extends BaseTest{
	
	ProductDetailsPage pd=new ProductDetailsPage(driver);

	@When("^user click on BuyNow Button$")
	 public void user_click_on_the_first_product()
	 {
		try {
			
			pd.clickBuyNowBtn();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{e.printStackTrace();}
		 
	 }
	
	@Then("^product details page is displayed$")
	 public void product_details_page_is_displayed()
	 {
		try {
			pd.verifyProductDetailsLabel();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	 }

 
}