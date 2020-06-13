package com.flipkart.automation;

import java.io.File;

import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/featurefiles"
 ,glue={"com/flipkart/automation/stepdefs"}, tags={"@searchtest1"},plugin = { "pretty", "html:target/cucumber-reports" },
 monochrome = true)

public class RunnerClass {
	 
}
