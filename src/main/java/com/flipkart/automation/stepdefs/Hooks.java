package com.flipkart.automation.stepdefs;

import com.flipkart.automation.stepdefs.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	BaseTest bastest;
	
		@Before
		public void initializeTest() {
			bastest = new BaseTest();
			bastest.launchBrowser();
		}
	
	
	@After
	public void teardown()
	{bastest.closeBrowser();
	
	}
	
	
}
