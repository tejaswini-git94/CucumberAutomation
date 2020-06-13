package com.flipkart.automation.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
	
	 public static WebDriver driver;

	    
	    public void launchBrowser() {
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        	driver=new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        	
        	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
	    }
	    public void closeBrowser() {
	    		try {
	    			driver.close();
	    			driver.quit();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
	    }
}





